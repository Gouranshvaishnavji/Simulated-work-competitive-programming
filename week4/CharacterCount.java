package week4;
import java.util.*;
public class CharacterCount {
    public static void main(String[] args) {
        // The input string where we need to count the occurrences of a character
        String str = "hello world!";  
        
        // The character to count in the string
        char target = 'o';  
        
        // Call the method to count occurrences of the character 'o'
        countCharacterOccurrences(str, target);  
    }

    // Method to count the occurrences of the character 'target' in the string 'str'
    public static void countCharacterOccurrences(String str, char target) {
        // Initialize a variable to count the occurrences of the character
        int count = 0;  
        
        // Convert the string to a character array and loop through each character
        for (char c : str.toCharArray()) {
            // If the current character matches the target character
            if (c == target) {  
                // Increment the counter by 1
                count++;  
            }
        }
        
        // Output the result: how many times the target character appears
        System.out.println("The character '" + target + "' appears " + count + " times.");
    }
}
