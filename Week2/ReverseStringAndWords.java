import java.util.Scanner;

public class ReverseStringAndWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the string
        System.out.println("Enter a string to reverse:");
        String input = scanner.nextLine();

        // Reverse the characters of the string
        String reversedString = reverseString(input);
        System.out.println("Reversed String: " + reversedString);

        // Reverse the words in the sentence
        String reversedWords = reverseWords(input);
        System.out.println("Reversed Words in Sentence: " + reversedWords);
    }

    // Method to reverse the characters in a string
    public static String reverseString(String str) {
        char[] charArray = str.toCharArray();
        int left = 0, right = charArray.length - 1;

        // Swap characters from both ends
        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }

        return new String(charArray);
    }

    // Method to reverse the words in a sentence
    public static String reverseWords(String str) {
        String[] words = str.split(" "); // Split the sentence into words
        StringBuilder reversed = new StringBuilder();

        // Traverse words in reverse order
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]).append(" ");
        }

        return reversed.toString().trim(); // Remove the trailing space
    }
}
