public class StringCalculator {


    public static int add(final String numbers){
        int returnValue = 0;
        String[] numbersArray = numbers.split(",|\n");
        for (String number : numbersArray){
            if (!number.trim().isEmpty()){
                int currentNumber = Integer.parseInt(number.trim());
                // If number is negative, throw exception
                if (currentNumber < 0){
                    throw new IllegalArgumentException("Negatives not allowed.");
                }
                // number >= 1000 will be ignored by treating it like a 0
                if (currentNumber >= 1000){
                    currentNumber = 0;
                }
                returnValue += currentNumber;
            }

        }
        return returnValue;
    }
}
