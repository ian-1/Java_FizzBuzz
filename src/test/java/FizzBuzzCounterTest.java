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
}
