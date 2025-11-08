// Import BigDecimal
import java.math.BigDecimal;

public class HelloPackage {

	public static void main(String[] args) {
		double d = 9.123456789;
		// Create a BigDecimal with the value of 9.123456789
		BigDecimal bigDec = new BigDecimal(d);
		BigDecimal ten = new BigDecimal(10);
		BigDecimal hundred = new BigDecimal(100);
		d = d*10;
		d = d/100;
		// Multiply bigDec by ten
		bigDec = bigDec.multiply(ten);
		// Divide bigDec by hundred
		bigDec = bigDec.divide(hundred);
		System.out.println(d);
		System.out.println(bigDec);
	}
}
