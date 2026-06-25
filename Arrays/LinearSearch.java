package Arrays;
import java.util.*;

public class LinearSearch {
    public static int linearSearch(int[] nums, int key) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {

        Scanner userNum = new Scanner(System.in);
        System.out.print("Enter the Array size :");
        int size = userNum.nextInt();

        int[] values = new int[size];
        System.out.print("Enter the Array elements :");
        for (int i = 0; i < size; i++) {
            values[i] = userNum.nextInt();
        }

        System.out.print("Enter the key value to search :");
        int key = userNum.nextInt();

        int index = linearSearch(values, key);

        if (index != -1) {
            System.out.println("Key found at index: " + index);
        } 
        else {
            System.out.println("The key value is not present in the given array.");
        }

        userNum.close();
    }
}
