package Arrays;
import java.util.*;

public class SecondLargest {
    public static int second_largest(int[] nums) {
        int largest = Integer.MIN_VALUE;
        int sec_large = Integer.MIN_VALUE;

        if(nums.length < 2){
            return Integer.MIN_VALUE;
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > largest) {
                sec_large = largest;
                largest = nums[i];
            } else if (nums[i] < largest && nums[i] > sec_large) {
                sec_large = nums[i];
            }
        }
        return sec_large;
    }

    public static void main(String args[]) {

        Scanner mynum = new Scanner(System.in);
        System.out.println("Enter array size :");
        int size = mynum.nextInt();

        int[] nums = new int[size];
        System.out.println("Enter the array values :");
        for (int i = 0; i < size; i++) {
            nums[i] = mynum.nextInt();
        }

        int result = second_largest(nums);

        if (result == Integer.MIN_VALUE) {
            System.out.println("Second largest element does not exist.");
        } else {
            System.out.println("Second largest element is : " + result);
        }

        mynum.close();
    }
}
