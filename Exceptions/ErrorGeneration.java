public class ErrorGeneration {

	public static void main(String[] args) {
    	System.out.println("Started the work");
		doWork(0);
        System.out.println("Work complete");
	}

	public static void doWork(int cycles) {
		if (cycles < 10) {
            // Add +1 to cycles after running
			cycles++;
			doWork(cycles);
		}
	}
}