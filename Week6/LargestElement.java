package Week6;
public class LargestElement {
    public static void main(String[] args) {
        int[] arr = {1, 4, 7, 2, 9, 5};
        System.out.println("Largest Element: " + findLargest(arr));
    }

    // Method to find the largest element in the array
    public static int findLargest(int[] arr) {
        if (arr.length == 0) throw new IllegalArgumentException("Array is empty.");
        int largest = arr[0];
        for (int num : arr) {
            if (num > largest) largest = num;
        }
        return largest;
    }
}
