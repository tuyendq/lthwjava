class NobelForPhysicsLaureates {
    public static void main(String[] args) {
    	
        // Create a String array called nobelLaureates
        String[] nobelLaureates = {"Curie", "Einstein", "Fermi"};
    
    	// Assign values to years
        int[] years = {1903, 1921, 1938};

        System.out.println("The Nobel Prize winners in Physics are:");
        for (int i = 0; i < nobelLaureates.length; i++) {
            System.out.println(nobelLaureates[i] + ", " + years[i]);
        }
	}
} 