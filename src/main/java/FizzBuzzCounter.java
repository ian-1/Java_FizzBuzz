import java.util.Objects;

public class FizzBuzzCounter {
    private final FizzBuzzConverter converter;

    FizzBuzzCounter() {
        converter = new FizzBuzzConverter();
    }

    Integer fizzCount(Integer startingNumber, Integer endingNumber) {
        return typeCount("Fizz", startingNumber, endingNumber);
    }

    Integer buzzCount(Integer startingNumber, Integer endingNumber) {
        return typeCount("Buzz", startingNumber, endingNumber);
    }

    Integer fizzBuzzCount(Integer startingNumber, Integer endingNumber) {
        return typeCount("FizzBuzz", startingNumber, endingNumber);
    }

    Integer typeCount(String type, Integer startingNumber, Integer endingNumber) {
        Integer Count = 0;
        for (int i = startingNumber; i <= endingNumber; i++) {
            if (Objects.equals(converter.fizzBuzz(i), type)) {
                Count++;
            }
        }
        return Count;
    }
}
