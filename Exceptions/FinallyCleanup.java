public class FinallyCleanup {

	public static void main(String[] args) {
		String[] words = { "Lorem", "ipsum", "dolor", "sit", "amet" };
		// Open a try block
		try {
			open();
			for (int i = 0; i <= words.length; i++) {
				writeToFile(words[i]);
			}
		// Catch any possible exception
		} catch (Exception e) {
			System.out.println("Problem writing words to file");
		// Add a finally block to close the file
		} finally {
			close();
		}
	}

	public static void open() {
		System.out.println("Our file is open");
	}

	public static void close() {
		System.out.println("Our file is closed");
	}

	public static void writeToFile(String text) {
		System.out.println(text + " has been written to the file");
	}
}