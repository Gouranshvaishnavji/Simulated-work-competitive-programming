package week7;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeating {
    public static void main(String[] args) {
        String s = "swiss";
        System.out.println("First non-repeating character: " + firstNonRepeating(s));
    }

    public static char firstNonRepeating(String s) {
        Map<Character, Integer> countMap = new LinkedHashMap<>();

        for (char c : s.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }

        for (char c : countMap.keySet()) {
            if (countMap.get(c) == 1) {
                return c;
            }
        }
        return '-'; // Return '-' if no non-repeating character exists
    }
}

