package Arrays;
import java.util.*;

public class RearrangeElements0s1s2s {
    public static void rearrangeElements012(int[] nums){
  
        int high = nums.length-1;
        int mid = 0;
        int low = 0;

        while(mid <= high){
            if(nums[mid] == 0){
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            }
            else if(nums[mid] == 1){
                mid++;
            }
            else if(nums[mid] == 2){
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
            else{
                System.out.println("Sorry your values not matched for algorithm. Pleae try again. (use only 1s,2s and 0s)");
                break;
            }
        }
    }

    public static void main(String args[]){

        Scanner userNum = new Scanner(System.in);
        System.out.println("Enter the array size : ");
        int size = userNum.nextInt();

        int[] values = new int[size];
        System.out.println("Enter the array values : ");
        for(int i = 0; i < size; i++){
            values[i] = userNum.nextInt();
        }

        rearrangeElements012(values);
        System.out.print(Arrays.toString(values));

        userNum.close();
    }
}
