class CharacterCounter {
  public static void main(String[] args) {
    String[] conjugation = {"hide", "hindered", "hiding", "hidden", "hindering", "hid", "hides", "hinder"};
    // Retrieve the number of words in the array by calling the correct field
    int tabLength = conjugation.length;
    int numberOfCharacters = 0;

    // Choose the appropriate operators (logical and increment)
    for (int i = 0; i < tabLength; i++) {
      // Give the proper variable to get each word out of conjugation
      String word = conjugation[i];
      numberOfCharacters += word.length();
    }
    System.out.println("There are " + numberOfCharacters + " characters in the list");
  }
}