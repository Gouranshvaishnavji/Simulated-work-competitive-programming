package week10;

public class ExcelSheetColumnTitle {
    public static String convertToTitle(int columnNumber) {
        StringBuilder result = new StringBuilder();

        while (columnNumber > 0) {
            columnNumber--; // Adjust to 0-based index
            char ch = (char) (columnNumber % 26 + 'A');
            result.insert(0, ch);
            columnNumber /= 26;
        }

        return result.toString();
    }

    public static void main(String[] args) {
        int columnNumber = 28;
        System.out.println("Excel Column Title: " + convertToTitle(columnNumber));
    }
}
