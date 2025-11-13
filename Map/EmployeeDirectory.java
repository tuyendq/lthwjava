// Import HashMap
import java.util.HashMap;

public class EmployeeDirectory {

	public static void main(String[] args) {
		// Create a HashMap directory of Integer to String using parameterized constructor
		HashMap<Integer, String> directory = new HashMap<Integer, String>();
		directory.put(23, "Joye");
		// Add employee "Marcia" with id 31 to the directory
		directory.put(31, "Marcia");
		directory.put(45, "Davy");
		System.out.println(directory);
		String name = directory.get(31);
		System.out.println(name);
		// Remove "Davy" from the directory
		directory.remove(45);
		System.out.println(directory);
	}
}