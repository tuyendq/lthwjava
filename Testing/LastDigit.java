public class LastDigit {
    public static void main(String[] args) {
    	// Write down an integer that causes an incorrect return value of lastDigit()
    	int n = -2147483648; 
        System.out.println("The last digit of " + n + " equals " + lastDigit(n) + ".");
    }

    public static int lastDigit(int a) {
        return a % 10;
    }
}