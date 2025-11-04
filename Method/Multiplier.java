class Multiplier {
  // Give these arguments the proper type
  static int mult(int n1, int n2) {
    // Use the appropriate operator to get the multiplication of 2 numbers
    return n1 * n2;
  }

  public static void main(String[] args) {
    int n = 5, m = 6;
    // Give the correct type to hours to retrieve the return value of mult
    int hours = mult(n, m);
    System.out.println("I'm working " + hours + " hours a week");
  }
}