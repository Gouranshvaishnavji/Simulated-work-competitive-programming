package week5;
public class PalindromeString {
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        System.out.println("Iterative approach: " + isPalindromeIterative(str));
        System.out.println("Recursive approach: " + isPalindromeRecursive(cleanString(str), 0, cleanString(str).length() - 1));
    }

    // Method to check if a string is a palindrome iteratively
    public static boolean isPalindromeIterative(String str) {
        str = cleanString(str); // Clean string to ignore spaces and special characters
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false; // If characters at the ends are different, not a palindrome
            }
            start++;
            end--;
        }
        return true; // If all characters match, it's a palindrome
    }

    // Recursive approach to check for palindrome
    public static boolean isPalindromeRecursive(String str, int start, int end) {
        if (start >= end) return true; // Base case: single character or empty string is a palindrome
        if (str.charAt(start) != str.charAt(end)) return false; // Characters mismatch
        return isPalindromeRecursive(str, start + 1, end - 1); // Recurse inward
    }

    // Helper method to clean the string by removing non-alphanumeric characters and converting to lowercase
    public static String cleanString(String str) {
        return str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    }
}
