package Arrays;

import java.util.*;

public class RearrangeNegativeZeroPositive {
    public static int[] rearrangeArrayBysign(int[] nums) {

        int index = 0;
        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                result[index] = nums[i];
                index++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                result[index] = nums[i];
                index++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                result[index] = nums[i];
                index++;
            }
        }

        return result;

    }

    public static void main(String args[]) {

        Scanner userNum = new Scanner(System.in);
        System.out.println("Enter the array size : ");
        int size = userNum.nextInt();

        int[] values = new int[size];
        System.out.println("Enter the array values : ");
        for (int i = 0; i < size; i++) {
            values[i] = userNum.nextInt();
        }
        int[] result = rearrangeArrayBysign(values);
        System.out.println("The result is : ");
        for (int num : result) {
            System.out.print(num + " ");
        }

        userNum.close();
    }
}
