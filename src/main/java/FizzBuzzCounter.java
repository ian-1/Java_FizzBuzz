public class FizzBuzzCounter {
    private FizzBuzzConverter converter;

    FizzBuzzCounter() {
        converter = new FizzBuzzConverter();
    }

    Integer fizzCount(Integer startingNumber, Integer endingNumber) {
        Integer fizzCount = 0;
        for(int i = startingNumber; i <= endingNumber; i++) {
            if (i % 3 == 0) {
                fizzCount++;
            }
        }
        return fizzCount;
    }
}
