import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzPrinterTest {
    private FizzBuzzPrinter subject;

    @BeforeEach
    public void setup() {
        subject = new FizzBuzzPrinter();
    }

    @Test
    @DisplayName("returns correct format string")
    void testReturnsCorrectFormatString() {
        String result = subject.print(1, 2);
        String lineOne = "Fizz: 0\n";
        String lineTwo = "Buzz: 0\n";
        String lineThree = "FizzBuzz: 0\n";
        String expectation = lineOne + lineTwo + lineThree;
        assertEquals(expectation, result);
    }
}
