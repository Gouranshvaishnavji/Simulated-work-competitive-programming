package Week6;

public class Factorial {
    public static void main(String[] args) {
        int number = 5; // Example number
        System.out.println("Factorial (Iterative): " + factorialIterative(number));
        System.out.println("Factorial (Recursive): " + factorialRecursive(number));
    }

    // Iterative approach
    public static int factorialIterative(int n) {
        if (n < 0) throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i; // Multiply iteratively
        }
        return result;
    }

    // Recursive approach
    public static int factorialRecursive(int n) {
        if (n < 0) throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        if (n == 0 || n == 1) return 1; // Base case
        return n * factorialRecursive(n - 1); // Recursive call
    }
}
