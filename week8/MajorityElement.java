package week8;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {3, 2, 3};

        int result = findMajorityElement(nums);
        System.out.println("Majority element: " + result);
    }

    public static int findMajorityElement(int[] nums) {
        int count = 0, candidate = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        return candidate;
    }
}
