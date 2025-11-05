class LongestFinder {
  // Give the appropriate type to wordsList
  static String findLongestIn(String[] wordsList) {
    String longest = "";

    for (String word : wordsList) {
      // Enter the fitting comparison to select the longer word
      if (word.length() > longest.length())
        longest = word;
    }
    return longest;
  }

  public static void main(String[] args) {
    String[] words = {"possible", "first", "null", "avoidance", "mineral", "pretty", "tree", "rather", "innocuous"};
    // Call the correct method to find the longest word
    System.out.println(findLongestIn(words));
  }
}