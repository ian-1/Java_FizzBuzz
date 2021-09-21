public class FizzBuzzPrinter {
    private final FizzBuzzCounter counter;
    private static final String fizzTemplate = "Fizz: %s\n";
    private static final String buzzTemplate = "Buzz: %s\n";
    private static final String fizzBuzzTemplate = "FizzBuzz: %s\n";

    FizzBuzzPrinter() {
        counter = new FizzBuzzCounter();
    }

    String print(Integer startingNumber, Integer endingNumber) {
        Integer fizzCount = counter.fizzCount(startingNumber, endingNumber);
        Integer buzzCount = counter.buzzCount(startingNumber, endingNumber);
        Integer fizzBuzzCount = counter.fizzBuzzCount(startingNumber, endingNumber);
        String lineOne = String.format(fizzTemplate, fizzCount);
        String lineTwo = String.format(buzzTemplate, buzzCount);
        String lineThree = String.format(fizzBuzzTemplate, fizzBuzzCount);
        return lineOne + lineTwo + lineThree;
    }
}
