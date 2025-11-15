// package exceptions;

public class ThrowingExample {

	public static int[] scores = { 75, 97, 83 };

	public static void main(String[] args) {
		// Add a try block
		try {
			int lastScore = getScore(3);
			System.out.println("Last score:" + lastScore);
		// Catch the exception thrown by getScore(int)
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Tried to access non-existent score");
		}
	}

	// Throw ArrayIndexOutOfBoundsException
	public static int getScore(int index) throws ArrayIndexOutOfBoundsException {
		return scores[index];
	}
}