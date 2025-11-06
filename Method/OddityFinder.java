class OddityFinder {
  public static void main(String[] args) {
    int[] intArray = {32, 67, 86, 90, 26, 34, 92, 13, 70, 50};
    
    for (int number : intArray) {
      // Call your custom method
      if (isOdd(number)) System.out.print(number + "\n");
    }
  }

  // Give the correct return type for your method
  public static boolean isOdd(int n) {
    // Use clever math to determine that it is odd
    return (n % 2) != 0;
  }
}