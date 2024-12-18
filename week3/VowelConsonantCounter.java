package week3;
import java.util.Scanner;

public class VowelConsonantCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the string
        System.out.println("Enter a string to analyze:");
        String input = scanner.nextLine().toLowerCase(); // Convert to lowercase for uniformity

        int vowels = 0, consonants = 0;

        // Iterate over each character in the string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // Check if the character is a letter
            if (Character.isLetter(ch)) {
                if (isVowel(ch)) {
                    vowels++; // Increment vowel count
                } else {
                    consonants++; // Increment consonant count
                }
            }
        }

        // Output the results
        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);
        scanner.close();

    }

    // Method to check if a character is a vowel
    private static boolean isVowel(char ch) {
        return "aeiou".indexOf(ch) != -1; // Check if character is in the set of vowels
    }
}
