package week7;

public class PalindromeString {
    public static void main(String[] args) {
        String input = "A man, a plan, a canal: Panama";
        System.out.println("Is the string a palindrome? " + isPalindrome(input));
    }

    public static boolean isPalindrome(String str) {
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(); // Clean and normalize
        int start = 0, end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}

