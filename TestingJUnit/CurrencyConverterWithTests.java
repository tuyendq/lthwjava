import org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CurrencyConverterWithTests {
    public static void main(String[] args) {
		launchTestsAndPrint(CurrencyConverterTest.class);
    }
}

class CurrencyConverter {
    public static double convert(double currency, double exchangeRate) {
        return currency * exchangeRate;
    }
}

class CurrencyConverterTest {

    @Test
    void convert_returnsConvertedCurrency_whenValidInputs() {
        double currency = 100;
        double exchangeRate = 1.2;

		// Call the convert method with the currency and exchange rate
        double convertedCurrency = CurrencyConverter.convert(currency, exchangeRate); 
		
		// Use the correct JUnit assertion, the expected value, and the converted currency amount
        assertEquals(120, convertedCurrency); 
    }
}