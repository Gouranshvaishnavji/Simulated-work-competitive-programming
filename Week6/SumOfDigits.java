package Week6;

public class SumOfDigits {
    public static void main(String[] args) {
        int number = 12345; // Example number
        System.out.println("Sum of Digits: " + sumOfDigits(number));
    }

    // Method to calculate the sum of digits
    public static int sumOfDigits(int number) {
        int sum = 0;
        while (number != 0) {
            sum += Math.abs(number % 10); // Add the last digit
            number /= 10; // Remove the last digit
        }
        return sum;
    }
}
