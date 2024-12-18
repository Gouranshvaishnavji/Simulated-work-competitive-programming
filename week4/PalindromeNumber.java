package week4;
public class PalindromeNumber {

    public static void main(String[] args) {
        int number = 121;  // Example number to check if it's a palindrome
        boolean result = isPalindrome(number);

        if (result) {
            System.out.println(number + " is a palindrome number.");
        } else {
            System.out.println(number + " is not a palindrome number.");
        }
    }

    // Method to check if a number is a palindrome
    public static boolean isPalindrome(int number) {
        int originalNumber = number;  // Store the original number for later comparison
        int reversedNumber = 0;  // This will store the reversed number
        int remainder;

        // Reverse the number
        while (number != 0) {
            remainder = number % 10;  // Get the last digit of the number
            reversedNumber = reversedNumber * 10 + remainder;  // Build the reversed number
            number /= 10;  // Remove the last digit from the number
        }

        // Compare the reversed number with the original number
        return originalNumber == reversedNumber;
    }
}
