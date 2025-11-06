class PriceCalculator {
  // Give the correct type to your function
  static double oneAndAHalf(double a) {
    // Use the proper operations to get the result
    return a * 1.5;
  }

  public static void main(String[] args) {
    double[] numbers = {76, 38.3, 10, 42, 98.5, 84, 50, 72.2, 98, 96};

    // Use the congruous type of for loop
    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = oneAndAHalf(numbers[i]);
      System.out.println(numbers[i]);
    }
  }
}