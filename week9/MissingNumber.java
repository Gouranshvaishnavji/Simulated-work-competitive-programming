package week9;

public class MissingNumber {
    // Function to find the missing number
    public static int findMissing(int[] arr) {
        int n = arr.length + 1; // Total numbers including the missing one
        int totalSum = n * (n + 1) / 2; // Expected sum of first n natural numbers
        int actualSum = 0; // Sum of elements in the array

        // Calculate the actual sum of array elements
        for (int num : arr) {
            actualSum += num;
        }

        // The difference between the expected and actual sums gives the missing number
        return totalSum - actualSum;
    }

    public static void main(String[] args) {
        // Example input
        int[] arr = {1, 2, 4, 3, 6};
        System.out.println("Missing Number: " + findMissing(arr));
    }
}