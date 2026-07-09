package Search;
import java.util.*;
public class JumpSearch {

    public static int jumpSearch(int[] nums, int target){
        int n = nums.length;
        int jump = (int)Math.sqrt(n);
        int prev = 0;
        int current = jump;

        while(nums[Math.min(current, n)-1] < target){
            prev = current;
            current += jump;
        }
        for(int i = prev; i < Math.min(current, n); i++){
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

        System.out.println("The target value present at index: "+jumpSearch(values,targetValue));
        
        userNum.close();
    }
}
