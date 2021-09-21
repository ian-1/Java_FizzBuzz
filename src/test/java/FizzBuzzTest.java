import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    private FizzBuzzCalculator subject;

    @BeforeEach
    public void setup() {
        subject = new FizzBuzzCalculator();
    }

    @Test
    @DisplayName("Returns non-special number as string")
    void testReturnsNonSpecialNumberAsString() {
        String result = subject.fizzBuzz(2);
        assertEquals("2", result);
    }

    @Test
    @DisplayName("Returns multiples of three as Fizz")
    void testReturnsMultiplesOfThreeAsFizz() {
        String result = subject.fizzBuzz(6);
        assertEquals("Fizz", result);
    }

    @Test
    @DisplayName("Returns multiples of five as Buzz")
    void testReturnsMultiplesOfFiveAsBuzz() {
        String result = subject.fizzBuzz(10);
        assertEquals("Buzz", result);
    }

    @Test
    @DisplayName("Returns multiples of three and five as FizzBuzz")
    void testReturnsMultiplesOfThreeAndFiveAsFizzBuzz() {
        String result = subject.fizzBuzz(30);
        assertEquals("FizzBuzz", result);
    }
}
