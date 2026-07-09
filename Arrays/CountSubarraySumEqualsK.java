package Arrays;
import java.util.*;

public class CountSubarraySumEqualsK {

    /* 
    //Brute force
    public static int countSubarraySumEqualsK(int[] nums, int k){
        
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            int sum = 0;
            for(int j = i; j < nums.length; j++){
                sum +=nums[j];
                if(sum == k){
                count++;
                }
            }
        }
        
        return count;
    }
        */

    public static int countSubarraySumEqualsK(int[] nums, int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int presum = 0;
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            presum += nums[i];
            int remove = presum - k;
            if(map.containsKey(remove)){
                count = count + map.get(remove);
            }
            map.put(presum, map.getOrDefault(presum,0) + 1);
        }
        return count;
    }

    public static void main(String[] args){
        Scanner userNum = new Scanner(System.in);
        System.out.println("Enter the array size :");
        int size = userNum.nextInt();

        int[] values = new int[size];
        System.out.println("Enter the array values :");
        for(int i = 0; i < size; i++){
            values[i] = userNum.nextInt();
        }

        System.out.println("Enter the K value :");
        int key = userNum.nextInt();

        System.out.println("The count is: "+countSubarraySumEqualsK(values, key));

        userNum.close();
    }
}
