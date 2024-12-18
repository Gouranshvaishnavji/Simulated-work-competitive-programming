package week5;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Original array: " + Arrays.toString(arr));
        reverseArray(arr);
        System.out.println("Reversed array: " + Arrays.toString(arr));
    }

    // Method to reverse an array iteratively
    public static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            // Swap elements at the start and end
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            // Move inward
            start++;
            end--;
        }
    }
}

