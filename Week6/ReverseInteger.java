package Week6;

public class ReverseInteger {
    public static void main(String[] args) {
        int number = -12345; // Example number
        System.out.println("Reversed Integer: " + reverseInteger(number));
    }

    // Method to reverse an integer
    public static int reverseInteger(int number) {
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10; // Extract the last digit
            // Handle overflow
            if (reversed > Integer.MAX_VALUE / 10 || reversed < Integer.MIN_VALUE / 10) {
                throw new ArithmeticException("Integer overflow occurred.");
            }
            reversed = reversed * 10 + digit; // Build reversed number
            number /= 10; // Remove the last digit
        }
        return reversed;
    }
}

