public class Main {  
	  // Mark Formula static
    static class Formula{
    
        // Create the calculateSpeed static method
        static double calculateSpeed(double distance, double time) {
          return distance / time;
        }            
    
    }  
    static class Car {
        public String color;
        // Make "model" and "year" public
        public String model;
        public int year;
        // Create private property "vehicleNumber"
        private int vehicleNumber;

        Car(String color, String model, int year) {
            this.color = color;
            this.model = model;
            this.year = year;
            this.vehicleNumber = 101189;
        }

        // Create deployAirbags method
        private void deployAirbags() {
		    System.out.println("airbags deployed");
        }

        // Make "turnEngineOn" method public
        public void turnEngineOn() {
            System.out.println("engine is on");            
        }

        // Make "calculateMPG" method public
        public int calculateMPG(int milesDriven, int gallonsUsed) {
            return milesDriven / gallonsUsed;
        }
    }

    public static void main(String[] args) {
        Car myCar = new Car("red", "camry", 2022);
        System.out.println(myCar.calculateMPG(180, 20));
        // Print the result of the calculateSpeed method with the correct parameters
        System.out.println(Formula.calculateSpeed(165.00, 15.00));
    }
}