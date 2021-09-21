import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzCounterTest {
    private FizzBuzzCounter subject;
    private iFizzBuzzConverter mockConverter;

    @BeforeEach
    public void setup() {
        mockConverter = new MockFizzBuzzConverter();
        subject = new FizzBuzzCounter(mockConverter);
    }

    @Test
    @DisplayName("fizzCount returns number of Fizzes")
    void testFizzCountReturnsNumberOfFizzes() {
        Integer result = subject.fizzCount(4, 10);
        assertEquals(2, result);
    }

    @Test
    @DisplayName("fizzCount returns number of Fizzes excluding FizzBuzzes")
    void testFizzCountReturnsNumberOfFizzesExcludingFizzBuzzes() {
        Integer result = subject.fizzCount(7, 16);
        assertEquals(2, result);
    }

    @Test
    @DisplayName("buzzCount returns number of Buzzes excluding FizzBuzzes")
    void testBuzzCountReturnsNumberOfBuzzesExcludingFizzBuzzes() {
        Integer result = subject.buzzCount(7, 20);
        assertEquals(2, result);
    }

    @Test
    @DisplayName("fizzBuzzCount returns number of FizzBuzzes")
    void testFizzBuzzCountReturnsNumberOfFizzBuzzes() {
        Integer result = subject.fizzBuzzCount(16, 31);
        assertEquals(1, result);
    }


    private static class MockFizzBuzzConverter implements iFizzBuzzConverter {
        List<String> returns = new ArrayList<>(
                Arrays.asList("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz",
                "Buzz", "11", "Fizz", "13", "14", "FizzBuzz", "16", "17", "Fizz", "19",
                "Buzz", "Fizz", "22", "23", "Fizz", "Buzz", "26", "Fizz", "28", "29",
                "FizzBuzz", "31"));

        public String fizzBuzz(Integer inputNumber) {
            return this.returns.get(inputNumber - 1);
        }
    }
}
