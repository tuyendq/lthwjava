class Interactor {
  public static void main(String[] args) {
    String object = "Wall";

    // Write down the correct keyword to allow for case switching
    switch (object) {
      case "Door":
        System.out.println("You have discovered a new room");
        break;
      case "Fridge":
        System.out.println("The food is all yours");
        break;
      // Enter the correct constant to give the same behavior to Window and Wall
      case "Wall":
      case "Window":
        System.out.println("I can't go through that");
        // Make sure you don't go through the default case by using the correct keyword
        break;
      default:
        System.out.println("This object cannot be interacted with");
        break;
    }
  }
}