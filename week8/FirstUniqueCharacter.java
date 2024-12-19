package week8;

import java.util.HashMap;

public class FirstUniqueCharacter {
    public static void main(String[] args) {
        String s = "loveleetcode";

        int result = firstUniqChar(s);
        System.out.println("First unique character index: " + result);
    }

    public static int firstUniqChar(String s) {
        HashMap<Character, Integer> charCount = new HashMap<>();

        // Count occurrences of each character
        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // Find the first unique character
        for (int i = 0; i < s.length(); i++) {
            if (charCount.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1; // No unique character found
    }
}
