package projects.f5.amstrong_java;

public class AmstrongNumber {

    public static boolean isArmstrongNumber(int number) {
        int totalDigits = (int) Math.floor(Math.log10(number)) + 1;
        int sum = 0;
        int newNumber = number;

        while (newNumber > 0) {
            int currentDigit = newNumber % 10;
            sum += Math.pow(currentDigit, totalDigits);
            newNumber /= 10;
        }

        return sum == number;
    }

}
