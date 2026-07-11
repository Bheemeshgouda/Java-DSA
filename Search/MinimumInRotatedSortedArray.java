package Search;

import java.util.Scanner;

public class MinimumInRotatedSortedArray {

    public static int minimumInRotatedSortedArray(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        int minimum = Integer.MAX_VALUE;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[low] <= nums[high]) {
                minimum = Math.min(minimum, nums[low]);
                break;
            }
            if (nums[low] <= nums[mid]) {
                minimum = Math.min(minimum, nums[low]);
                low = mid + 1;
            } else {
                minimum = Math.min(minimum, nums[mid]);
                high = mid - 1;
            }
        }
        return minimum;
    }

    public static void main(String[] args) {
        Scanner userNum = new Scanner(System.in);
        System.out.println("Enter the array size : ");
        int size = userNum.nextInt();

        int[] values = new int[size];
        System.out.println("Enter the array values : ");
        for (int i = 0; i < size; i++) {
            values[i] = userNum.nextInt();
        }

        System.out.println("The minimum value in the given array is : " + minimumInRotatedSortedArray(values));

        userNum.close();
    }
}
