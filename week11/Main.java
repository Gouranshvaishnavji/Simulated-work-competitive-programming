package week11;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        String haystack = "hello", needle = "ll";
        System.out.println(strStr(haystack, needle));
    }

    public static int strStr(String haystack, String needle) {
        if (needle.isEmpty()) return 0;
        int n = haystack.length(), m = needle.length();
        for (int i = 0; i <= n - m; i++) {
            if (haystack.substring(i, i + m).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
    //----------------------------------------------reverse
    // public static void main(String[] args) {
    //     int x = 123;
    //     System.out.println(reverse(x));
    // }
    // public static int reverse(int x) {
    //     int result = 0;
    //     while (x != 0) {
    //         int digit = x % 10;
    //         if (result > Integer.MAX_VALUE / 10 || result < Integer.MIN_VALUE / 10) {
    //             return 0;
    //         }
    //         result = result * 10 + digit;
    //         x /= 10;
    //     }
    //     return result;
    // }
    // ----------------------------------------------------------palindrome
    // public static void main(String[] args) {
    //     int x = 121;
    //     System.out.println(isPalindrome(x));
    // }

    // public static boolean isPalindrome(int x) {
    //     if (x < 0 || (x % 10 == 0 && x != 0)) return false;
    //     int reversed = 0;
    //     while (x > reversed) {
    //         reversed = reversed * 10 + x % 10;
    //         x /= 10;
    //     }
    //     return x == reversed || x == reversed / 10;
    // }
    //-----------------------------------------------------merge
    // import java.util.Arrays;

    // public static void main(String[] args) {
    //     int[] nums1 = {1, 2, 3, 0, 0, 0};
    //     int[] nums2 = {2, 5, 6};
    //     merge(nums1, 3, nums2, 3);
    //     System.out.println(Arrays.toString(nums1));
    // }

    // public static void merge(int[] nums1, int m, int[] nums2, int n) {
    //     int p1 = m - 1, p2 = n - 1, p = m + n - 1;
    //     while (p1 >= 0 && p2 >= 0) {
    //         nums1[p--] = (nums1[p1] > nums2[p2]) ? nums1[p1--] : nums2[p2--];
    //     }
    //     while (p2 >= 0) {
    //         nums1[p--] = nums2[p2--];
    //     }
    // }
    // //------------------------movezeroes
    // public static void main(String[] args) {
    //     int[] nums = {0, 1, 0, 3, 12};
    //     moveZeroes(nums);
    //     System.out.println(Arrays.toString(nums));
    // }

    // public static void moveZeroes(int[] nums) {
    //     int index = 0;
    //     for (int num : nums) {
    //         if (num != 0) {
    //             nums[index++] = num;
    //         }
    //     }
    //     while (index < nums.length) {
    //         nums[index++] = 0;
    //     }
    // }
    //--------------------------removeduplicates
    // public static void main(String[] args) {
    //     int[] nums = {1, 1, 2};
    //     int length = removeDuplicates(nums);
    //     System.out.println("Length: " + length);
    //     for (int i = 0; i < length; i++) {
    //         System.out.print(nums[i] + " ");
    //     }
    // }

    // public static int removeDuplicates(int[] nums) {
    //     if (nums.length == 0) return 0;
    //     int index = 1;
    //     for (int i = 1; i < nums.length; i++) {
    //         if (nums[i] != nums[i - 1]) {
    //             nums[index++] = nums[i];
    //         }
    //     }
    //     return index;
    // }
    // day 55--------------------------------------------------------
    // public static void main(String[] args) {
    //     int[] nums = {1, 1, 1};
    //     int k = 2;
    //     System.out.println("Number of subarrays: " + subarraySum(nums, k));
    // }

    // public static int subarraySum(int[] nums, int k) {
    //     HashMap<Integer, Integer> sumMap = new HashMap<>();
    //     sumMap.put(0, 1); // Base case: One way to get a sum of 0
    //     int currentSum = 0;
    //     int count = 0;
    //     for (int num : nums) {
    //         currentSum += num;
    //         if (sumMap.containsKey(currentSum - k)) {
    //             count += sumMap.get(currentSum - k);
    //         }
    //         sumMap.put(currentSum, sumMap.getOrDefault(currentSum, 0) + 1);
    //     }
    //     return count;
    // }
    //-=-------------------------------------------------
    // public static void main(String[] args) {
    //     int[] prices = {7, 1, 5, 3, 6, 4};
    //     System.out.println("Maximum Profit: " + maxProfit(prices));
    // }

    // public static int maxProfit(int[] prices) {
    //     int minPrice = Integer.MAX_VALUE;
    //     int maxProfit = 0;
    //     for (int price : prices) {
    //         if (price < minPrice) {
    //             minPrice = price;
    //         } else if (price - minPrice > maxProfit) {
    //             maxProfit = price - minPrice;
    //         }
    //     }
    //     return maxProfit;
    // }


}

