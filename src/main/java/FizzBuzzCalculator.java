public class FizzBuzzCalculator {
    String fizzBuzz(Integer inputNumber) {
        if (inputNumber % 3 == 0 ) {
            return "Fizz";
        } else {
            return inputNumber.toString();
        }
    }
}
