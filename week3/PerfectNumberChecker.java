package week3;
import java.util.Scanner;

public class PerfectNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.println("Enter a positive integer to check if it is a perfect number:");
        int number = scanner.nextInt();

        // Validation for positive input
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        // Calculate the sum of proper divisors
        int sumOfDivisors = 0;
        for (int i = 1; i <= number / 2; i++) { // Check divisors up to number / 2
            if (number % i == 0) {
                sumOfDivisors += i; // Add the divisor to the sum
            }
        }

        // Check if the number is perfect
        if (sumOfDivisors == number) {
            System.out.println(number + " is a perfect number.");
        } else {
            System.out.println(number + " is not a perfect number.");
        }
    }
}
