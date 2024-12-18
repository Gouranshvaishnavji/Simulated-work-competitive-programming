package week7;

public class ReverseWords {
    public static void main(String[] args) {
        String s = "  The sky   is blue  ";
        System.out.println("Reversed words: '" + reverseWords(s) + "'");
    }

    public static String reverseWords(String s) {
        String[] words = s.trim().split("\\s+"); // Split by one or more spaces
        StringBuilder reversed = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i > 0) reversed.append(" ");
        }
        return reversed.toString();
    }
}
