import java.util.Objects;

public class FizzBuzzCounter implements iFizzBuzzCounter{
    private final iFizzBuzzConverter converter;

    FizzBuzzCounter() {
        this.converter = new FizzBuzzConverter();
    }

    FizzBuzzCounter(iFizzBuzzConverter converter) {
        this.converter = converter;
    }

    public Integer fizzCount(Integer startingNumber, Integer endingNumber) {
        return typeCount("Fizz", startingNumber, endingNumber);
    }

    public Integer buzzCount(Integer startingNumber, Integer endingNumber) {
        return typeCount("Buzz", startingNumber, endingNumber);
    }

    public Integer fizzBuzzCount(Integer startingNumber, Integer endingNumber) {
        return typeCount("FizzBuzz", startingNumber, endingNumber);
    }

    private Integer typeCount(String type, Integer startingNumber, Integer endingNumber) {
        Integer Count = 0;
        for (int i = startingNumber; i <= endingNumber; i++) {
            if (Objects.equals(this.converter.fizzBuzz(i), type)) {
                Count++;
            }
        }
        return Count;
    }
}
