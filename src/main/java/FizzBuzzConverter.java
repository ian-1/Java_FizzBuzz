public class FizzBuzzConverter implements iFizzBuzzConverter {
    public String fizzBuzz(Integer inputNumber) {
        if (isFizzBuzzy(inputNumber)) {
            return fizzBuzzReplacement(inputNumber);
        } else {
            return inputNumber.toString();
        }
    }

    private boolean isFizzBuzzy(Integer inputNumber) {
        return inputNumber % 3 == 0 || inputNumber % 5 == 0;
    }

    private String fizzBuzzReplacement(Integer inputNumber) {
        String outputString = "";
        if (inputNumber % 3 == 0 ) {
            outputString += "Fizz";
        }
        if (inputNumber % 5 == 0 ) {
            outputString += "Buzz";
        }
        return outputString;
    }
}
