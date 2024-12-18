package week4;
public class Factorial {
    public static void main(String[] args) {
        // Input number for which we need to find the factorial
        int number = 5;

        // Calling the iterative method to calculate the factorial
        System.out.println("Iterative Approach:");
        System.out.println("Factorial of " + number + " is " + factorialIterative(number));

        // Calling the recursive method to calculate the factorial
        System.out.println("\nRecursive Approach:");
        System.out.println("Factorial of " + number + " is " + factorialRecursive(number));
    }

    // Iterative method to calculate factorial
    public static int factorialIterative(int n) {
        // Initialize result as 1 (since factorial of 0 is 1)
        int result = 1;

        // Loop to multiply the result by each number from 1 to n
        for (int i = 1; i <= n; i++) {
            result *= i;  // Multiply result by i (result = result * i)
        }
        return result;
    }

    // Recursive method to calculate factorial
    public static int factorialRecursive(int n) {
        // Base case: if n is 0 or 1, return 1
        if (n == 0 || n == 1) {
            return 1;
        } else {
            // Recursive case: n * factorial of (n - 1)
            return n * factorialRecursive(n - 1);
        }
    }
}
