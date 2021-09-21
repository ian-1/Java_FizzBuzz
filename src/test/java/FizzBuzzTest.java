import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    @DisplayName("Returns non-special numbers")
    void testReturnsNonSpecialNumbers() {
        FizzBuzzCalculator subject = new FizzBuzzCalculator();
        String result = subject.fizzBuzz(2);
        assertEquals("2", result);
    }

    @Test
    @DisplayName("Returns multiples of three as Fizz")
    void testReturnsMultiplesOfThreeAsFizz() {
        FizzBuzzCalculator subject = new FizzBuzzCalculator();
        String result = subject.fizzBuzz(6);
        assertEquals("Fizz", result);
    }
}
