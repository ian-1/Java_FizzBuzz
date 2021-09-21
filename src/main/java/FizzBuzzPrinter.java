public class FizzBuzzPrinter {
    private static final String fizzTemplate = "Fizz: %s\n";
    private static final String buzzTemplate = "Buzz: %s\n";
    private static final String fizzBuzzTemplate = "FizzBuzz: %s\n";

    String print(Integer startingNumber, Integer endingNumber) {
        String lineOne = String.format(fizzTemplate, "0");
        String lineTwo = String.format(buzzTemplate, "0");
        String lineThree = String.format(fizzBuzzTemplate, "0");
        return lineOne + lineTwo + lineThree;
    }
}
