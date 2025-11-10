// Import HashSet
import java.util.HashSet;

public class Sizes {

	public static void main(String[] args) {
    	// Create an HashSet of Integer using parameterized constructor
        HashSet<Integer> heights = new HashSet<Integer>();
		heights.add(72);
        // Add 64 to the set
        heights.add(64);
		heights.add(66);
		heights.remove(64);
        // Add null to the set
        heights.add(null);
		System.out.println(heights);
	}
}