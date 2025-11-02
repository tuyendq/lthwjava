class DomainChecker {
  public static void main(String[] args) {
    String toFind = ".gov";
    String url = "https://www.usa.gov/holidays";

    // Use the right function to check if our url contains the .gov domain
    System.out.println(url.contains(toFind));
  }
}