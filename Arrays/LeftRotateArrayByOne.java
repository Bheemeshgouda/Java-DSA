package Arrays;
import java.util.*;

public class LeftRotateArrayByOne {
    public static void leftRotateOnePlace(int[] nums){
        int temp = nums[0];
        for(int i = 1; i < nums.length; i++){
            nums[i-1] = nums[i];
        }
        nums[nums.length - 1] = temp;
    }

    public static void main(String args[]){

        Scanner mynum = new Scanner(System.in);
        System.out.println("Enter array size :");
        int size = mynum.nextInt();

        int values[] = new int[size];
        System.out.println("Enter the array values : ");
        for(int i = 0; i < size; i++){
            values[i] = mynum.nextInt();
        }

        leftRotateOnePlace(values);
        
        System.out.println("The result is (After left rotation by one place) :");
        for(int num : values){
            System.out.println(num +" ");
        }

        mynum.close();
    }
}
