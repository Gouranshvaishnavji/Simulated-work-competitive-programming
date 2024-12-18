package Week6;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};
        int length = removeDuplicates(arr);
        System.out.println("Array after removing duplicates: " + Arrays.toString(Arrays.copyOf(arr, length)));
    }

    // Method to remove duplicates in-place
    public static int removeDuplicates(int[] arr) {
        if (arr.length == 0) return 0;
        int uniqueIndex = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[uniqueIndex]) {
                uniqueIndex++;
                arr[uniqueIndex] = arr[i];
            }
        }
        return uniqueIndex + 1; // New length of the array
    }
}

