package week7;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 5, 6}; // Example array
        System.out.println("Missing number is: " + findMissingNumber(nums));
    }

    public static int findMissingNumber(int[] nums) {
        int n = nums.length + 1; // Total range should have n + 1 numbers
        int expectedSum = n * (n + 1) / 2; // Sum of first n natural numbers
        int actualSum = Arrays.stream(nums).sum(); // Sum of elements in the array

        return expectedSum - actualSum; // Missing number
    }
}
