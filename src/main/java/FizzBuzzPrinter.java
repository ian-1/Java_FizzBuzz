public class FizzBuzzPrinter {
    private final iFizzBuzzCounter counter;
    private static final String fizzTemplate = "Fizz: %s\n";
    private static final String buzzTemplate = "Buzz: %s\n";
    private static final String fizzBuzzTemplate = "FizzBuzz: %s\n";

    FizzBuzzPrinter() {
        this.counter = new FizzBuzzCounter();
    }

    FizzBuzzPrinter(iFizzBuzzCounter counter) {
        this.counter = counter;
    }

    String print(Integer startingNumber, Integer endingNumber) {
        Integer fizzCount = this.counter.fizzCount(startingNumber, endingNumber);
        Integer buzzCount = this.counter.buzzCount(startingNumber, endingNumber);
        Integer fizzBuzzCount = this.counter.fizzBuzzCount(startingNumber, endingNumber);
        String lineOne = String.format(fizzTemplate, fizzCount);
        String lineTwo = String.format(buzzTemplate, buzzCount);
        String lineThree = String.format(fizzBuzzTemplate, fizzBuzzCount);
        return lineOne + lineTwo + lineThree;
    }
}
