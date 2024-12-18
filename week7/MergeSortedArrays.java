package week7;

import java.util.Arrays;

public class MergeSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {1, 3, 5, 0, 0, 0};
        int[] nums2 = {2, 4, 6};
        int m = 3; // Number of valid elements in nums1
        int n = nums2.length;

        merge(nums1, m, nums2, n);
        System.out.println("Merged array: " + Arrays.toString(nums1));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1; // Pointer for nums1's valid elements
        int j = n - 1; // Pointer for nums2
        int k = m + n - 1; // Pointer for the merged array

        // Traverse backwards and merge
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }

        // Copy remaining elements from nums2 if any
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }
}
