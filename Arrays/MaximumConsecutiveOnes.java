package Arrays;
import java.util.*;
public class MaximumConsecutiveOnes {
    public static int maximumConsecutiveOnes(int[] nums){
        int count = 0;
        int maximum = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                count++;
                maximum = Math.max(maximum,count);
            }
            else{
                count = 0;
            } 
        }
        return maximum;
    }

    public static void main(String[] args){
        Scanner userNum = new Scanner(System.in);
        System.out.println("Enter the array size : ");
        int size = userNum.nextInt();

        int[] values = new int[size];
        System.out.println("Enter the values : ");
        for(int i = 0; i < size; i++){
            values[i] = userNum.nextInt();
        }
        System.out.println("Maximum Consecutive Ones: " + maximumConsecutiveOnes(values));

        userNum.close();
    }
}
