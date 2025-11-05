class StringReverser {

  // Give the correct name and parameter type for the method
  static String reverse(String toReverse) {
    String tmp = "";
    // Give the appropriate starting value for i
    for (int i = toReverse.length() - 1; i >= 0; i--) {
      tmp += toReverse.charAt(i);
    }
    return tmp;
  }

  public static void main(String[] args) {
    String word = "stressed";
    System.out.println(reverse(word));
  }
}