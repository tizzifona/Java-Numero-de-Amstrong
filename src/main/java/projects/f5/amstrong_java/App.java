package projects.f5.amstrong_java;

public final class App {
    public static void main(String[] args) {
        int[] testCases = { 371, 1634, 351, 2015 };

        System.out.println("Checking Armstrong numbers:");
        System.out.println("---------------------------");
        for (int number : testCases) {

            if (AmstrongNumber.isAmstrongNumber(number)) {
                System.out.println(number + " is an Amstrong number");
            } else {
                System.out.println(number + " is not an Amstrong number");
            }
        }
    }
}
