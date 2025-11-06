public class Main {  

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
    }
}