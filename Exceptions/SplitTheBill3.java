import java.math.BigDecimal;

class SplitTheBill3 {
	public static void main(String[] args) {
		BigDecimal bill = new BigDecimal(125.50);
		computeEachBill(bill, 5);
		computeEachBill(bill, 0);
	}

	public static void computeEachBill(BigDecimal bill, int people) {
		try {
			BigDecimal numPeople = new BigDecimal(people);
			BigDecimal individualBill = bill.divide(numPeople);
			System.out.println("Bill for each person is: " + individualBill);
            // Catch any exception
		} catch (Exception e) {
			System.out.println("You didn't provide a positive number of people to split the bill among.");
            // Print the type (class) of exception
			System.out.println("Type of exception: " + e.getClass());
            // Print the exception message
			System.out.println(e.getMessage());
            // Print the stack trace
            e.printStackTrace();
		}
	}
}
