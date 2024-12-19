package week9;

public class LargestSumNonAdjacent {
    public static void main(String[] args) {
        int[] nums = {3, -2, 5, 10, 7};
        System.out.println("Largest sum: " + maxSum(nums));
    }

    public static int maxSum(int[] nums) {
        int include = 0, exclude = 0;

        for (int num : nums) {
            int temp = include;
            include = exclude + num;
            exclude = Math.max(temp, exclude);
        }
        return Math.max(include, exclude);
    }
}
