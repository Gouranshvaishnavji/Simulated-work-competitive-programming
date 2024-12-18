package week5;
public class SumOfDigits {
    public static void main(String[] args) {
        int number = -12345; // Example number
        System.out.println("Sum of digits (iterative): " + sumOfDigitsIterative(number));
        System.out.println("Sum of digits (recursive): " + sumOfDigitsRecursive(Math.abs(number)));
    }

    // Iterative method to calculate the sum of digits
    public static int sumOfDigitsIterative(int number) {
        number = Math.abs(number); // Consider absolute value for negatives
        int sum = 0;
        while (number > 0) {
            sum += number % 10; // Add the last digit
            number /= 10; // Remove the last digit
        }
        return sum;
    }

    // Recursive method to calculate the sum of digits
    public static int sumOfDigitsRecursive(int number) {
        if (number == 0) return 0; // Base case
        return number % 10 + sumOfDigitsRecursive(number / 10); // Sum last digit and recurse
    }
}
