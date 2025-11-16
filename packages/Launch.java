import java.math.BigDecimal;

public class Launch {

	public static void main(String[] args) {
    	// Create an instance of the Rocket POJO
		Rocket rocket = new Rocket();
		rocket.setName("Saturn");
        // Set the thrust field to as a BigDecimal
		rocket.setThrust(new BigDecimal("7770000"));
        // Set the rocket's manned Boolean wrapper field to true
		rocket.setManned(true);
		fire(rocket);
	}

	public static void fire(Rocket r) {
		BigDecimal newtons = r.getThrust().divide(new BigDecimal(224));
		System.out.println("We have liftoff of: " + r.getName());
		System.out.print("Thrust is: " + newtons + " newtons of energy");
	}

	static public class Rocket {

		private String name;
		private BigDecimal thrust;
		private Boolean manned;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public BigDecimal getThrust() {
			return thrust;
		}
		public void setThrust(BigDecimal thrust) {
			this.thrust = thrust;
		}
		public Boolean isManned() {
			return manned;
		}
		public void setManned(Boolean manned) {
			this.manned = manned;
		}
	}
}

