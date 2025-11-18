import java.util.HashSet;

public class CityDisplay {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();

        cities.add("New York");
        cities.add("Los Angeles");
        cities.add("Chicago");

        // Use enhanced for-loop
        for (String city: cities) {
         	// Print each city name inside the set
            System.out.println(city);
        }
    }
}
