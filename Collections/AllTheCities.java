import java.util.Collections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class AllTheCities {

	public static void main(String[] args) {
		String[] euCapitals = {"Paris", "London", "Prague"};
		ArrayList<String> capitals = new ArrayList<String>();
        
        // Add cities to capitals all at once
		Collections.addAll(capitals, "Lima", "Bogota", "Santiago");
        // Convert euCapitals to List
        List<String> euCapitalsList = Arrays.asList(euCapitals);
        // Sort capitals
        Collections.sort(capitals);
        // Reverse capitals
        Collections.reverse(capitals);
        
		System.out.println(capitals);
		System.out.println(euCapitalsList);
		System.out.println(euCapitals);
	}
}