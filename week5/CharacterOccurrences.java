package week5;
public class CharacterOccurrences {
    public static void main(String[] args) {
        String str = "Programming is fun!";
        char target = 'h';
        System.out.println("The character '" + target + "' appears " + countOccurrences(str, target) + " times.");
    }

    // Method to count occurrences of a character
    public static int countOccurrences(String str, char target) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == target) count++;
        }
        return count;
    }
}
