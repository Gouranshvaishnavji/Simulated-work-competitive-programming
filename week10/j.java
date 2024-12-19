package week10;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;

public class j {
    public static int[] intersect(int[] nums1, int[] nums2) {
        // HashMap to store the frequency of elements in nums1
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer> result = new ArrayList<>();
        
        // Traverse through nums2 and check if the element exists in map
        for (int num : nums2) {
            if (map.containsKey(num) && map.get(num) > 0) {
                result.add(num);  // Add the element to result
                map.put(num, map.get(num) - 1);  // Decrease the count of the element
            }
        }

        // Convert List to array and return
        int[] res = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            res[i] = result.get(i);
        }
        return res;
    }

    public static void main(String[] args) {
        // IntersectionOfArrays solution = new IntersectionOfArrays();
        
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        
        int[] result = intersect(nums1, nums2);
        for (int num : result) {
            System.out.print(num + " ");  // Output: 2 2
        }
    }
}