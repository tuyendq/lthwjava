class Breaker {
  public static void main(String[] args) {
    for (int i = 1; i < 64; i*=2) {
      System.out.println(i);
      if (i >= 8) {
        // Use the proper keyword to stop the loop
        break;
      }
    }
    System.out.println("Broke out of the loop");
  }
}