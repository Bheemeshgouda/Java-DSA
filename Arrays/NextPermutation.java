package Arrays;

import java.util.*;

public class NextPermutation {

    public static void nextPermutation(int[] nums) {

        int n = nums.length;
        int pivot = -1;

        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                pivot = i;
                break;
            }
        }

        if (pivot == -1) {
            reverse(nums, 0, n - 1);
            return;
        }

        for (int i = n - 1; i > pivot; i--) {
            if (nums[i] > nums[pivot]) {
                int temp = nums[i];
                nums[i] = nums[pivot];
                nums[pivot] = temp;
                break;
            }
        }

        reverse(nums, pivot + 1, n - 1);
    }

    public static void reverse(int[] nums, int left, int right) {
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }
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

        nextPermutation(values);

        System.out.println("Next Permutation: " + Arrays.toString(values));

        userNum.close();
    }
}