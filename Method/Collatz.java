class Collatz {
  static boolean isEven(int n) {
    return n % 2 == 0;
  }
  
  public static void main(String[] args) {
    int n = 1634;
    int i = 0;
    System.out.print(n);
    // Enter the appropriate termination condition
    while (n != 1) {
      // Call a method to check if n is even
      if (isEven(n)) {
        System.out.println(" is even");
        n /= 2;
      } // Handle the odd case correctly. All non-even integers are odd
      else {
        System.out.println(" is odd");
        n = n * 3 + 1;
      }
      System.out.print(n);
      i += 1;
    }
    System.out.println(" reached in " + i + " steps");
  }
}