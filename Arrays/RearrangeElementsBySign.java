package Arrays;
import java.util.*;

public class RearrangeElementsBySign {
    public static int[] rearrangeElementBySign(int[] nums){
        int[] output = new int[nums.length];
        int positiveIndex = 0;
        int negativeIndex = 1;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] < 0){
                output[negativeIndex] = nums[i];
                negativeIndex += 2;
            }
            else{
                output[positiveIndex] = nums[i];
                positiveIndex += 2;
            }
        }
        return output;
    }

    public static void main(String[] args){

        Scanner userNum = new Scanner(System.in);
        System.out.println("Enter the array size : ");
        int size = userNum.nextInt();

        int[] values = new int[size];
        System.out.println("Enter the array values : ");
        for(int i = 0; i < size; i++){
            values[i] = userNum.nextInt();
        }
        int[] result = rearrangeElementBySign(values);
        System.out.print("The result is : ");
        for(int num : result){
            System.out.print(num + " ");
        }

        userNum.close();
    }
}
