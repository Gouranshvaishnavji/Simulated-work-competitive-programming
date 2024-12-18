package week3;
import java.util.Scanner;

public class LongestWordFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompting the user to enter a sentence
        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine();

        // Removing punctuation and splitting the sentence into words
        String[] words = sentence.replaceAll("[^a-zA-Z ]", "").split("\\s+");

        // Initializing variables to keep track of the longest word
        String longestWord = "";
        int maxLength = 0;

        // Iterating through the words array to find the longest word
        for (String word : words) {
            if (word.length() > maxLength) {
                longestWord = word;
                maxLength = word.length();
            }
        }

        // Printing the longest word
        System.out.println("The longest word in the sentence is: " + longestWord);
        System.out.println("Its length is: " + maxLength);
    }
}
