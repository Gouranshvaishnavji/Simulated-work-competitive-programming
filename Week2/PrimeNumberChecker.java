import java.util.Scanner;

public class PrimeNumberChecker {
    // Check if a number is prime
    static boolean isPrime(int n) {
        if (n <= 1) return false; // Numbers less than or equal to 1 are not prime
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false; // If divisible, not prime
        }
        return true;
    }

    // Generate primes in a range
    static void generatePrimes(int start, int end) {
        System.out.println("Prime numbers between " + start + " and " + end + ":");
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to check if it's prime:");
        int number = scanner.nextInt();
        System.out.println(number + " is prime? " + isPrime(number));

        System.out.println("Enter range to generate primes (start and end):");
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        generatePrimes(start, end);
    }
}
