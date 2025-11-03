class Squarer {
  // Give this function the proper return type
  static int squareOf5() {
    return 5 * 5;
  }

  public static void main(String[] args) {
    // Call the correct function name defined above
    int hours = squareOf5();
    System.out.println("I'm working " + hours + " hours a week");
  }
}