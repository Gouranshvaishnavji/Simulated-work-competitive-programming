package week4;
public class PrimeNumbersInRange {

    public static void main(String[] args) {
        int start = 10;  // Start of the range
        int end = 50;    // End of the range

        System.out.println("Prime numbers between " + start + " and " + end + " are:");

        // Call the method to print prime numbers in the given range
        printPrimeNumbersInRange(start, end);
    }

    // Method to print prime numbers in a given range
    public static void printPrimeNumbersInRange(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // Print a new line after the list of prime numbers
    }

    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        // If the number is less than 2, it is not prime
        if (number < 2) {
            return false;
        }

        // Only check divisibility up to the square root of the number for optimization
        for (int i = 2; i <= Math.sqrt(number); i++) {
            // If the number is divisible by any number, it's not prime
            if (number % i == 0) {
                return false;
            }
        }
        return true; // The number is prime if no divisors were found
    }
}
