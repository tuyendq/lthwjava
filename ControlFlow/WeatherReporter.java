class WeatherReporter {
  public static void main(String[] args) {
    String weather = "Sunny";

    switch (weather) {
      // Use the correct keyword to make it a case to check
      case "Windy":
        System.out.println("Take an umbrella");
        break;
      // Enter the appropriate name to check for sunny
      case "Sunny":
        System.out.println("Don't forget your sunscreen");
        // Write the correct keyword down to make sure the message will be unique
        break;
      case "Cloudy":
        System.out.println("The umbrella might be great");
        break;
      default:
        System.out.println("I don't know what the weather will be like");
    }
  }
}