import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
public class LastDigitWithTestsFail {
    public static void main(String[] args) {
        launchTestsAndPrint(LastDigitTest.class);
    }
}

class LastDigit {
    public static int lastDigit(int a) {
        return a % 10;
    }
}

class LastDigitTest {
    // Use the correct annotation to mark this as a JUnit test
    @Test
    void testLastDigit() {
        int number = -2025;
        int expected = 5;

        // Call the method under test
        int actual = LastDigit.lastDigit(number);

        // Use the correct JUnit assertion for the scenario
        assertEquals(expected, actual);
    }
}