// Import LinkedList
import java.util.LinkedList;

public class Shopping2 {

	public static void main(String[] args) {

		// Create an LinkedList of Strings using parameterized constructor
		LinkedList<String> shopList = new LinkedList<String>();
		shopList.addLast("milk");
        // Add eggs to the end of the list
		shopList.addLast("eggs");
		shopList.addLast("bread");
		// Add milk to the beginning of the list again
		shopList.addFirst("milk");
		System.out.println(shopList);
		shopList.set(3,"rye-bread");
		shopList.remove("milk");
		System.out.println(shopList);
		System.out.println(shopList.size());
	}
}