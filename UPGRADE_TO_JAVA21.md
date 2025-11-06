# Upgrade to Java 21 (LTS)

This repository is marked to target Java 21 (the latest LTS) for development and tools.

- A `.java-version` file has been added at the project root with the value `21` to indicate the intended runtime.
- For Windows users, a helper script is added at `scripts/upgrade-java21.ps1` which attempts to install Eclipse Adoptium Temurin 21 using `winget` and prints guidance to set `JAVA_HOME`.

Recommended steps to switch your environment to Java 21:

1. Install a JDK 21 distribution (Eclipse Temurin, Adoptium, Azul, Microsoft Temurin, or Oracle) for your OS.
   - On Windows you can try the helper script (run in an elevated PowerShell if required):

```powershell
pwsh ./scripts/upgrade-java21.ps1
```

2. Set JAVA_HOME to the JDK root and ensure `java -version` prints a 21.x release.

3. If you use a build tool (Maven/Gradle), update the toolchain or source/target compatibility to 21. This repository currently contains only plain Java source files and no build wrapper files (no pom.xml or build.gradle). If you add a build tool, set the Java target accordingly.

Verification:

```powershell
java -version
cat .java-version
```

If you want help adding a Gradle or Maven wrapper and configuring the project to build with Java 21, tell me and I can create a simple Gradle build and tests.
