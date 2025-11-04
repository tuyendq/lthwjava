class Greeter {
  // Enter the keyword to be able to access it in main
  static void genericGreeter() {
    System.out.println("Nice day to you !");
  }

  // Give the correct type to the argument of the method
  static void specificGreeter(String name) {
    // Call the correct variable given as an argument to the method
    System.out.println("Nice day to you, " + name + "!");
  }  

  public static void main(String[] args) {
    // Call the above function to have the program greet you
    genericGreeter();

    String firstName = "Caleb";
    specificGreeter(firstName);    
  }
}