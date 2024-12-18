import java.util.Scanner;

public class factoorial {
    // Recursive method to calculate factorial
    static int factorialRecursive(int n) {
        if (n == 0) {
            return 1; // Base case: 0! = 1
        }
        return n * factorialRecursive(n - 1); // Recursive case
    }

    // Iterative method to calculate factorial
    static int factorialIterative(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i; // Multiply each number up to n
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to calculate its factorial:");
        int number = scanner.nextInt();

        // Iterative approach
        System.out.println("Factorial using iteration: " + factorialIterative(number));

        // Recursive approach
        System.out.println("Factorial using recursion: " + factorialRecursive(number));
        scanner.close();
    }
}
