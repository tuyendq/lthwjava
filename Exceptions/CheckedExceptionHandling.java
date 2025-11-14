public class CheckedExceptionHandling {

	public static void main(String[] args) {
    	// Uncomment the try block
		try {
			Class.forName("java.util.ArrayList");
		// Uncomment the catch block for ClassNotFoundException
		} catch (ClassNotFoundException e) {
        	// Uncomment the message for the exception
			System.out.println("Work goes here to recover from the checked exception");
        // Uncomment the end of the try/catch
		}
		System.out.println("Work complete");
	}
}