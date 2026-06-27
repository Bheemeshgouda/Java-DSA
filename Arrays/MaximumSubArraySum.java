package Arrays;
import java.util.*;

public class MaximumSubArraySum {
    public static int maximumSubArraySum(int[] nums){
        int sum = 0;
        int maximumSum = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            sum = sum + nums[i];
        
            if(sum > maximumSum){
                maximumSum = sum;
            }
        
            if(sum < 0){
                sum = 0;
            }
        }    
        return maximumSum;
    }

    public static void main(String[] args){

        Scanner userNum = new Scanner(System.in);
        System.out.println("Enter the array size : ");
        int size = userNum.nextInt();

        int[] values = new int[size];
        System.out.println("Enter the values for Array : ");
        for(int i = 0; i < size; i++){
            values[i] = userNum.nextInt();
        }
        int result = maximumSubArraySum(values);
        System.out.println("The maximum subarray sum is :" + result);

        userNum.close();
        
    }
}
