package week5;

import java.util.Arrays;

public class LargestAndSmallest {
    public static void main(String[] args) {
        int[] arr = {3, 7, -1, 42, 0, -7, 18};
        findLargestAndSmallest(arr);
    }

    // Method to find largest and smallest element in an array
    public static void findLargestAndSmallest(int[] arr) {
        if (arr.length == 0) {
            System.out.println("Array is empty. No elements to compare.");
            return;
        }

        int largest = arr[0];
        int smallest = arr[0];

        for (int num : arr) {
            if (num > largest) largest = num;
            if (num < smallest) smallest = num;
        }

        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Largest element: " + largest);
        System.out.println("Smallest element: " + smallest);
    }
}
