package week4;
public class Fibonacci {

    public static void main(String[] args) {
        int n = 10; // The value of n for the Fibonacci sequence (e.g., first 10 numbers)

        // Iterative approach to print Fibonacci sequence
        System.out.println("Fibonacci Sequence (Iterative):");
        printFibonacciIterative(n);

        // Recursive approach to print Fibonacci sequence
        System.out.println("\nFibonacci Sequence (Recursive):");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciRecursive(i) + " ");
        }
    }

    // Iterative method to print Fibonacci sequence up to n
    public static void printFibonacciIterative(int n) {
        int a = 0, b = 1;

        // Loop to print the Fibonacci sequence
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            // Update the values for the next Fibonacci number
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println(); // New line after the sequence
    }

    // Recursive method to get the nth Fibonacci number
    public static int fibonacciRecursive(int n) {
        // Base cases: return n for 0th and 1st Fibonacci numbers
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }

        // Recursive case: Fibonacci(n) = Fibonacci(n-1) + Fibonacci(n-2)
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }
}
