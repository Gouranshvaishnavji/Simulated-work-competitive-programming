package week7;

import java.util.*;

public class IntersectionWithDuplicates {
    public static void main(String[] args) {
        int[] nums1 = {4, 9, 5, 4};
        int[] nums2 = {9, 4, 9, 8, 4};
        System.out.println("Intersection: " + Arrays.toString(intersect(nums1, nums2)));
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> countMap = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        // Count occurrences in nums1
        for (int num : nums1) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        // Find intersections with nums2
        for (int num : nums2) {
            if (countMap.getOrDefault(num, 0) > 0) {
                result.add(num);
                countMap.put(num, countMap.get(num) - 1); // Decrease count
            }
        }

        // Convert result to array
        return result.stream().mapToInt(i -> i).toArray();
    }
}

