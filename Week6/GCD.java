package Week6;

public class GCD {
    public static void main(String[] args) {
        int a = 56, b = 98; // Example numbers
        System.out.println("GCD: " + findGCD(a, b));
    }

    // Method to find GCD using Euclid's algorithm
    public static int findGCD(int a, int b) {
        if (b == 0) return a; // Base case
        return findGCD(b, a % b); // Recursive call
    }
}

