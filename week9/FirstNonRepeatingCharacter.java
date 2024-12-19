package week9;
import java.util.HashMap;

public class FirstNonRepeatingCharacter {
    public static char firstNonRepeatingCharacter(String str) {
        // Create a HashMap to store the frequency of each character
        HashMap<Character, Integer> charFrequency = new HashMap<>();
        
        // Iterate through the string and count the occurrences of each character
        for (char c : str.toCharArray()) {
            charFrequency.put(c, charFrequency.getOrDefault(c, 0) + 1);
        }
        
        // Iterate through the string again to find the first non-repeating character
        for (char c : str.toCharArray()) {
            if (charFrequency.get(c) == 1) {
                return c; // Return the first non-repeating character
            }
        }
        
        // If no non-repeating character is found, return a special character
        return '\0'; // Null character indicates no non-repeating character
    }

    public static void main(String[] args) {
        // Test cases
        String str1 = "swiss";
        String str2 = "programming";
        String str3 = "aabbcc";
        
        System.out.println("First non-repeating character in 'swiss': " + firstNonRepeatingCharacter(str1)); // Output: w
        System.out.println("First non-repeating character in 'programming': " + firstNonRepeatingCharacter(str2)); // Output: p
        System.out.println("First non-repeating character in 'aabbcc': " + firstNonRepeatingCharacter(str3)); // Output: (none, returns '\0')
    }
}




