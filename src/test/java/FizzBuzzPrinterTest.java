import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzPrinterTest {
    private FizzBuzzPrinter subject;

    @BeforeEach
    public void setup() {
        iFizzBuzzCounter mockCounter = new MockFizzBuzzCounter();
        subject = new FizzBuzzPrinter(mockCounter);
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

    @Test
    @DisplayName("returns correct values in string")
    void testReturnsCorrectValuesInString() {
        String result = subject.print(4, 31);
        String lineOne = "Fizz: 7\n";
        String lineTwo = "Buzz: 4\n";
        String lineThree = "FizzBuzz: 2\n";
        String expectation = lineOne + lineTwo + lineThree;
        assertEquals(expectation, result);
    }

    private class MockFizzBuzzCounter implements iFizzBuzzCounter {
        public Integer fizzCount(Integer startingNumber, Integer endingNumber) {
            if (isScenarioOne(startingNumber, endingNumber)) return 7; else return 0;
        }

        public Integer buzzCount(Integer startingNumber, Integer endingNumber) {
            if (isScenarioOne(startingNumber, endingNumber)) return 4; else return 0;
        }

        public Integer fizzBuzzCount(Integer startingNumber, Integer endingNumber) {
            if (isScenarioOne(startingNumber, endingNumber)) return 2; else return 0;
        }

        private boolean isScenarioOne(Integer startingNumber, Integer endingNumber) {
            return startingNumber == 4 && endingNumber == 31;
        }
    }
}
