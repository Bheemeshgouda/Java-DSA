package Search;
import java.util.*;
public class LinearSearch {
    public static int linearSearch(int[] nums, int target){
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target){
                return i;
            }
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

        System.out.println("Enter the values to search :");
        int targetValue = userNum.nextInt();

        System.out.println("The target value present at index: "+linearSearch(values,targetValue));
        
        userNum.close();
    }
    
}
