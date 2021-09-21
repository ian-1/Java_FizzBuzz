import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzCounterTest {
    private FizzBuzzCounter subject;

    @BeforeEach
    public void setup() {
        subject = new FizzBuzzCounter();
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
        Integer result = subject.fizzBuzzCount(16, 44);
        assertEquals(1, result);
    }
}
