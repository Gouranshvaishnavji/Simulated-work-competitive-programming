import java.util.Scanner;

public class FibonacciSequence {

    // Recursive method to generate nth Fibonacci number
    static int fibonacciRecursive(int n) {
        if (n <= 1) {
            return n; // Base case: return n if 0 or 1
        }
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2); // Recursive case
    }

    // Iterative method to generate the Fibonacci sequence
    static void fibonacciIterative(int n) {
        int first = 0, second = 1; // Starting terms
        System.out.print("Fibonacci sequence (Iterative): " + first + " " + second + " ");
        
        for (int i = 2; i < n; i++) {
            int next = first + second; // Calculate next term
            System.out.print(next + " ");
            first = second; // Update terms
            second = next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number of terms
        System.out.println("Enter the number of Fibonacci terms you want to generate:");
        int n = scanner.nextInt();

        // Iterative approach
        fibonacciIterative(n);

        // Recursive approach
        System.out.println("Fibonacci sequence (Recursive): ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciRecursive(i) + " ");
        }
        System.out.println();
    }
}
