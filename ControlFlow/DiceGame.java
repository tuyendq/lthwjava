class DiceGame {
  public static void main(String[] args) {
    int result = 5;

    // Use the correct operator to make sure it's a critical hit
    if (result == 20) {
      System.out.println("That's a critical hit!");
    }

    // Check if result is lower or equal to ten
    if (result <= 10) {
      System.out.println("Unfortunately, you miss");
    }
  }
}