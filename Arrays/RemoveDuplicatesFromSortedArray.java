package Arrays;
import java.util.*;

public class RemoveDuplicatesFromSortedArray {
    public static int removeDuplicates(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }

        int j = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[j] != nums[i]) {
                j++;
                nums[j] = nums[i];
            }
        }
        return j + 1;
    }

    public static void main(String args[]) {

        Scanner mynum = new Scanner(System.in);
        System.out.println("Enter the array size :");
        int size = mynum.nextInt();

        int[] values = new int[size];
        System.out.println("Enter the array values :");
        for (int i = 0; i < size; i++) {
            values[i] = mynum.nextInt();
        }

        int length = removeDuplicates(values);

        System.out.println("Unique elements count: " + length);

        for (int i = 0; i < length; i++) {
            System.out.print(values[i] + " ");
        }
        mynum.close();
    }
}
