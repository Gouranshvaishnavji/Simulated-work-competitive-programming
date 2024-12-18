package Week6;
public class PalindromeString {
    public static void main(String[] args) {
        String str = "madam";
        System.out.println("Is palindrome: " + isPalindrome(str));
    }

    // Method to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(); // Clean and normalize
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) return false; // Mismatch
            start++;
            end--;
        }
        return true;
    }
}
