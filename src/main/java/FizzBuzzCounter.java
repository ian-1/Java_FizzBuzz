import java.util.Objects;

public class FizzBuzzCounter {
    private final FizzBuzzConverter converter;

    FizzBuzzCounter() {
        converter = new FizzBuzzConverter();
    }

    Integer fizzCount(Integer startingNumber, Integer endingNumber) {
        Integer fizzCount = 0;
        for (int i = startingNumber; i <= endingNumber; i++) {
            if (Objects.equals(converter.fizzBuzz(i), "Fizz")) {
                fizzCount++;
            }
        }
        return fizzCount;
    }
}
