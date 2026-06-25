package Arrays;
import java.util.*;
public class LargestElement {
    public static int largest_element(int[] nums){
        int largest = nums[0];

        for(int i = 1; i<nums.length; i++){
            if(nums[i] > largest){
                largest = nums[i];
            }
        }
        return largest;
    }

    public static void main(String args[]){

        Scanner mynum = new Scanner(System.in);
        System.out.println("Enter the array size :");
        int size = mynum.nextInt();

        int[] nums = new int[size];
        System.out.println("Enter the array elements :");
        for(int i = 0; i < size; i++){
            nums[i] = mynum.nextInt();
        }

        System.out.println("Largest element is : " + largest_element(nums));

        mynum.close();
    }
}