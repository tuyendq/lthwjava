public class NullPointer {

    private static String name;

    public static void main(String[] args) {
    	// Call a method on name that will throw a NullPointerException
        System.out.println("My name has " + name.length() + " characters.");
    }
}