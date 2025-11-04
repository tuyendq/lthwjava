class Speller {
  public static void main(String[] args) {
    String toSpell = "conscientious";

    // Choose the correct method on toSpell to retrieve its length
    int wordLength = toSpell.length();

    // Use the right keyword and put the starting correct value into i
    for (int i = 0; i < wordLength; i++) {
      // Write down the correct method to retrieve the character at the ith position
      System.out.println(toSpell.charAt(i));
    }
  }
}