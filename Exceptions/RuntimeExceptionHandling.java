public class RuntimeExceptionHandling {

	public static void main(String[] args) {
		// Comment out this line
		// withoutTryCatch();
		// Uncomment this line
		withTryCatch();
	}

	public static void withoutTryCatch() {
		String[] mounts = { "Everest", "K2", "Kangchenjunga", "Lhotse" };
		String selectedMount = mounts[4];
		System.out.println("Selected item is: " + selectedMount);
	}

	public static void withTryCatch() {
		try {
			String[] mounts = { "Everest", "K2", "Kangchenjunga", "Lhotse" };
			String selectedMount = mounts[4];
			System.out.println("Selected item is: " + selectedMount);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Oops - made a mistake accessing the mounts array with a bad index.");
		}
	}
}