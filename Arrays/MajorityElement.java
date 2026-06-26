package Arrays;
import java.util.*;

public class MajorityElement {  
    public static int majorityElement(int[] nums){
        int count = 0;
        int element = 0;

        for(int i = 0; i<nums.length; i++){
            if(count == 0){
                element = nums[i];
                count = 1;
            }
            else if(nums[i] == element){
                count++;
            }
            else{
                count--;
            }
        }

        int count1 = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] == element){
                count1++;
            }
        }
            if(count1 > nums.length/2){
                return element;
            
        }
        return -1;
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
        System.out.println("Majority Element: " + majorityElement(values));

        userNum.close();
    }
}
