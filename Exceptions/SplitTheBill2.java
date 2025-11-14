import java.math.BigDecimal;

class SplitTheBill2 {
	public static void main(String[] args) {
		BigDecimal bill = new BigDecimal(125.50);
		computeEachBill(bill, 5);
		computeEachBill(bill, 0);
	}

	public static void computeEachBill(BigDecimal bill, int people) {
		BigDecimal individualBill = new BigDecimal(0);
		BigDecimal numPeople = new BigDecimal(people);
		// Add a try and the beginning of the try code block
		try {
			individualBill = bill.divide(numPeople);
        } catch (ArithmeticException e) {
			System.out.println("You didn't provide a positive number of people to split the bill among. Assuming 2 people.");
			numPeople = new BigDecimal(2);
			individualBill = bill.divide(numPeople);
			// End the catch code block and add a finally block
        } finally {
			System.out.println("Bill for each of " + numPeople + " persons is: " + individualBill);
		// End the finally block
        }
	}
}