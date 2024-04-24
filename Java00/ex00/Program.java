public class DigitSumCalculator {
    public static void main(String[] args) {
        int number = 479598;
        int sum = 0;

        // Calculate sum of digits
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }

        // Print the result
        System.out.println(sum);
        System.exit(0);
    }
}
