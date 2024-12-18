import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number
        System.out.println("Enter a number to find the sum of its digits:");
        int number = scanner.nextInt();

        // Handle negative numbers
        number = Math.abs(number); // Convert negative numbers to positive

        // Calculate sum of digits
        int sum = 0; // Initialize sum to 0
        while (number > 0) {
            int digit = number % 10; // Get the last digit
            sum += digit; // Add the digit to the sum
            number /= 10; // Remove the last digit
        }

        // Output the result
        System.out.println("The sum of the digits is: " + sum);
    }
}
