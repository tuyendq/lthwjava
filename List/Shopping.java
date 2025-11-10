// Import ArrayList
import java.util.ArrayList;

public class Shopping {

	public static void main(String[] args) {

		// Create an ArrayList of Strings using parameterized constructor
		ArrayList<String> shopList = new ArrayList<String>();
		shopList.add("milk");
		shopList.add("eggs");
		shopList.add("bread");
		// Add milk to the list again
		shopList.add("milk");
		System.out.println(shopList);
		// Change bread to rye-bread in the list
		shopList.set(2, "rye-bread");
		shopList.remove("milk");
		System.out.println(shopList);
		System.out.println(shopList.size());
	}
}