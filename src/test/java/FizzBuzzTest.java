import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    @DisplayName("Can return non-special number")
    void testReturnNonSpecialNumber() {
        FizzBuzzCalculator subject = new FizzBuzzCalculator();
        String result = subject.fizzBuzz(2);
        assertEquals("2", result);
    }
}
