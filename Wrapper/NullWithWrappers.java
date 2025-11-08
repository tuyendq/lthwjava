public class NullWithWrappers {

	// Declare a primitive integer called x
	static int x;
	// Declare a wrapper Integer called y
	static Integer y;

	public static void main(String[] args) {
       	// Display x value
		System.out.println(x);
		System.out.println(y);

		// Check if y has been initialized and is null
		if (y == null) {
			System.out.println("y is not initialized so take corrective steps here");
		}
	}
}