public class FizzBuzzCalculator {
    String fizzBuzz(Integer inputNumber) {
        if (inputNumber % 3 == 0 ) {
            return "Fizz";
        } else if (inputNumber % 5 == 0 ) {
            return "Buzz";
        } else {
            return inputNumber.toString();
        }
    }
}
