import java.math.BigDecimal;

class SplitTheBill {
	public static void main(String[] args) {
		BigDecimal bill = new BigDecimal(125.50);
		computeEachBill(bill, 5);
		computeEachBill(bill, 0);
	}

	public static void computeEachBill(BigDecimal bill, int people) {
		// Add a try and the beginning of the try code block
		try {
			BigDecimal numPeople = new BigDecimal(people);
			BigDecimal individualBill = bill.divide(numPeople);
			System.out.println("Bill for each person is: " + individualBill);
			// End the try code block and catch a possible ArithmeticException
        } catch (ArithmeticException e) {
			System.out.println("You didn't provide a positive number of people to split the bill among.");
			// End the catch code block
		}
	}
}