class Adder {
  public static void main(String[] args) {
    int total = 0;
    int i = 1;

    // Enter the correct keyword to create the loop
    while (total < 100) {
      // Call the appropriate variable to store the total reached
      total += i;
      // Use the fitting operation to have i increase by 2 each run
      i += 2;
    }

    System.out.println("We reach " + total + " when summing up to " + i);
  }
}