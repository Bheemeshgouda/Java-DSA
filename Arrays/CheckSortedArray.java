package Arrays;
import java.util.*;

public class CheckSortedArray {
    public static boolean check_array(int[] nums){
        for(int i = 1; i < nums.length; i++){
            if(nums[i] >= nums[i-1]){
                continue;
            }
            else{
                return false;
            }
        }
        return true;
    }

    public static void main (String args[]){

        Scanner mynum = new Scanner(System.in);
        System.out.println("Enter the array size :");
        int size = mynum.nextInt();

        int[] nums = new int[size];
        System.out.println("Enter the array values :");
        for(int i = 0; i<size; i++){
            nums[i] = mynum.nextInt();
        }

        System.out.println(check_array(nums));

        mynum.close();
    }
}
