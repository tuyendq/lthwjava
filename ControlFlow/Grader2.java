class Grader2 {
    public static void main(String[] args) {
        int grade = 14;

        // Catch failing grades lower than 10
        if (grade < 10) {
            System.out.println("Failing grade");
        } else if (grade < 14) {
            System.out.println("Passing grade");
        // Fill in the correct keyword    
        } else if (grade < 18) {
            System.out.println("With distinction");
        // Fill in the correct keyword    
        } else {
            System.out.println("With highest distinction");
        }
    }
}