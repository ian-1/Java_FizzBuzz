public class FizzBuzzCalculator {
    String fizzBuzz(Integer inputNumber) {
        String outputString = "";
        if (inputNumber % 3 == 0 || inputNumber % 5 == 0 ) {
            if (inputNumber % 3 == 0 ) {
                outputString += "Fizz";
            }
            if (inputNumber % 5 == 0 ) {
                outputString += "Buzz";
            }
        } else {
            outputString +=  inputNumber.toString();
        }
        return outputString;
    }
}
