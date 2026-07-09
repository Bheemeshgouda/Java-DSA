package Search;
import java.util.*;
public class BinarySearch {

    public static int binarySearch(int[] nums, int target){
        int low = 0;
        int high = nums.length - 1;

        while(low <= high){
            int mid = (low + high)/2;

            if(nums[mid] == target){
                return mid;
            }
            else if(target > nums[mid]){
                low = mid++;
            }
            else{
                high = mid--;
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

        System.out.println("The target value present at index: "+binarySearch(values,targetValue));
        
        userNum.close();
    }
}
