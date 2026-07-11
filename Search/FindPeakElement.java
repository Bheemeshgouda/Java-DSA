package Search;

import java.util.Scanner;

public class FindPeakElement {

    public static int findPeakElement(int[] nums) {
        /*
         * int low = 0;
         * int high = nums.length - 1;
         * 
         * if (nums.length == 1)
         * return nums[0];
         * 
         * while (low < high) {
         * 
         * int mid = low + (high - low) / 2;
         * 
         * if (nums[mid] < nums[mid + 1]) {
         * low = mid + 1;
         * } else {
         * high = mid;
         * }
         * 
         * }
         * 
         * return low;
         */

        int n = nums.length;
        if (n == 1)
            return 0;
        if (nums[0] > nums[1])
            return 0;
        if (nums[n - 1] > nums[n - 2])
            return n - 1;

        int low = 1;
        int high = n - 2;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1])
                return mid;
            else if (nums[mid] < nums[mid + 1]) {
                low = mid + 1; 
            } 
            else {
                high = mid - 1; 
            }
        }
        return -1;

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

        System.out.println("The Peak element in the given array is : " + findPeakElement(values));

        userNum.close();
    }
}
