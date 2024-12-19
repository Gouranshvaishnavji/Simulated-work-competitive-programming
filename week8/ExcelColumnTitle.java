package week8;

public class ExcelColumnTitle {
    public static void main(String[] args) {
        int columnNumber = 701; // Example: 701 → ZY
        String result = convertToTitle(columnNumber);
        System.out.println("Excel Column Title: " + result);
    }

    public static String convertToTitle(int columnNumber) {
        StringBuilder columnTitle = new StringBuilder();

        while (columnNumber > 0) {
            columnNumber--; // Shift to 0-based indexing
            char c = (char) ('A' + (columnNumber % 26));
            columnTitle.append(c);
            columnNumber /= 26;
        }

        return columnTitle.reverse().toString();
    }
}
