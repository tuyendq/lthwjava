public class Main {  
	  // Mark Formula static
    static class Formula{
    
        // Create the calculateSpeed static method
        static double calculateSpeed(double distance, double time) {
          return distance / time;
        }            
    
    }

    // Create ElectricCar interface with activateSelfDriving method
    interface ElectricCar {
    
        void activateSelfDriving();
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

    // Enable the "Toyota" class to inherit from "Car"
 	  static class Toyota extends Car {        
        public Toyota(String color, String model, int year){
        	// Call the "Car" constructor using "super()"
           super(color, model, year);
        }
    }

    public static void main(String[] args) {
        Car myCar = new Car("red", "camry", 2022);
        System.out.println(myCar.calculateMPG(180, 20));
        // Print the result of the calculateSpeed method with the correct parameters
        System.out.println(Formula.calculateSpeed(165.00, 15.00));
        // Create "myToyota" instance of Toyota and print out the "model"
        Toyota myToyota = new Toyota("black", "yaris", 2014);
        System.out.println(myToyota.model);
    }
}