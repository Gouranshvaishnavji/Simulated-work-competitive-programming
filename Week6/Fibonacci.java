package Week6;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 10; // Example value
        System.out.println("Iterative Fibonacci: " + fibonacciIterative(n));
        System.out.println("Recursive Fibonacci: " + fibonacciRecursive(n));
    }

    // Iterative approach
    public static int fibonacciIterative(int n) {
        if (n <= 1) return n;
        int a = 0, b = 1, result = 0;
        for (int i = 2; i <= n; i++) {
            result = a + b;
            a = b;
            b = result;
        }
        return result;
    }

    // Recursive approach
    public static int fibonacciRecursive(int n) {
        if (n <= 1) return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }
}
