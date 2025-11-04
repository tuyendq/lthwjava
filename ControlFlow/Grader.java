class Grader {
  public static void main(String[] args) {
    int grade = 14;

    // Check if the grade is above 11
    if (grade > 11) {
      System.out.println("You've outdone yourself");
      // If the above condition is not met, check if the grade is at least 10
    } else if (grade >= 10) {
      System.out.println("You get a passing grade");
      // Add the correct keyword to grab every other possible case
    } else {
      System.out.println("You get a failing grade");
    }
  }
}