<#
.\scripts\upgrade-java21.ps1

Helper script to install Java 21 (Adoptium Temurin) on Windows using winget.
This script attempts a safe, non-destructive install and prints instructions to set
JAVA_HOME if the install succeeds.

Run as: PowerShell (pwsh) in admin mode when required for winget.
#>

param()

function Write-Info($msg){ Write-Host "[INFO] $msg" -ForegroundColor Cyan }
function Write-Warn($msg){ Write-Host "[WARN] $msg" -ForegroundColor Yellow }
function Write-Err($msg){ Write-Host "[ERROR] $msg" -ForegroundColor Red }

Write-Info "This script will attempt to install Eclipse Temurin JDK 21 (LTS) using winget."

# Check if winget is available
if (-not (Get-Command winget -ErrorAction SilentlyContinue)) {
    Write-Warn "winget not found. Please install Java 21 manually from https://adoptium.net/ or install winget first."
    exit 2
}

Write-Info "Querying winget for Adoptium Temurin 21..."

$pkg = winget search --id Eclipse.Adoptium.Temurin.21.JDK -s msstore 2>$null | Select-String "Eclipse.Adoptium.Temurin.21.JDK" -Quiet

# Use the canonical id for Temurin 21. If that fails, try a generic Temurin 21 search.
if ($LASTEXITCODE -ne 0) {
    Write-Info "Exact package id not found; attempting a more general search for Temurin 21..."
    $search = winget search Temurin 21 | Out-String
    if ($search -match "Temurin" ) {
        Write-Info "Found candidate packages; proceeding with 'Eclipse.Adoptium.Temurin.21.JDK' install attempt."
    } else {
        Write-Warn "No Temurin 21 package found via winget. Please install manually from https://adoptium.net/ (choose JDK 21)."
        exit 3
    }
}

Write-Info "Installing Eclipse Temurin JDK 21 (may require elevation)..."
try {
    winget install --id Eclipse.Adoptium.Temurin.21.JDK -e --silent
    $rc = $LASTEXITCODE
} catch {
    Write-Err "winget install failed: $_"
    exit 4
}

if ($rc -ne 0) {
    Write-Warn "winget returned non-zero exit code ($rc). The install may have failed or require manual steps."
    Write-Info "Please install Java 21 from https://adoptium.net/ and re-run this script."
    exit $rc
}

Write-Info "Install completed (or winget reported success)."

# Try to locate the installed JDK folder
Write-Info "Attempting to locate installed JDK 21..."
$possibleRoots = @(
    "$env:ProgramFiles\Eclipse Adoptium",
    "$env:ProgramFiles\Temurin",
    "$env:ProgramFiles\Adoptium",
    "$env:ProgramFiles(x86)\Eclipse Adoptium"
)

$jdkPath = $null
foreach ($root in $possibleRoots) {
    if (Test-Path $root) {
        $cands = Get-ChildItem -Path $root -Directory -ErrorAction SilentlyContinue | Where-Object { $_.Name -match "21" } | Sort-Object -Descending
        if ($cands) { $jdkPath = $cands[0].FullName; break }
    }
}

if (-not $jdkPath) {
    # fallback: try where java.exe and find parent
    $javaExe = (Get-Command java -ErrorAction SilentlyContinue).Source
    if ($javaExe) {
        $jdkPath = Split-Path (Split-Path $javaExe -Parent) -Parent
    }
}

if ($jdkPath) {
    Write-Info "Detected JDK path: $jdkPath"
    Write-Host "To set JAVA_HOME for your current session run:"
    Write-Host "    $env:PSHOME\pwsh.exe -NoProfile -Command \"$env:env:JAVA_HOME='$jdkPath'\"" -ForegroundColor Green
    Write-Host "Or to set system-wide (requires admin):"
    Write-Host "    [Environment]::SetEnvironmentVariable('JAVA_HOME', '$jdkPath', 'Machine')" -ForegroundColor Green
    Write-Host "After setting JAVA_HOME, verify with:" -ForegroundColor Cyan
    Write-Host "    java -version" -ForegroundColor Green
} else {
    Write-Warn "Could not reliably detect the installed JDK path. Check the installer output or verify by running 'java -version'."
}

Write-Info "Done."
