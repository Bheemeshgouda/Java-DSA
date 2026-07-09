package Arrays;
import java.util.*;

public class LogestConsecutiveSequence {

    /* 
    //Brute force 
    public static boolean linearSearch(int[] nums, int num){
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == num){
                return true;
            }
        }
        return false;
    }

    public static int logestConsecutiveSequence(int [] nums){

        if(nums.length == 0){
        return 0
        }

        int logest = 1;
        for(int i = 0; i < nums.length; i++){
            int x = nums[i];
            int count = 1;

            while(linearSearch(nums, x+1) == true){
                x++;
                count++;
            }
            if(count > logest){
                logest = count;
            }
        }
        return logest;
    }
         */

    /*
    //Better Solution 
    public static int logestConsecutiveSequence(int [] nums){
        int currentCount = 0;
        int lastSmaller = Integer.MIN_VALUE;
        int longest = 1;

        for(int i = 0; i < nums.length; i++){
            if(nums.length == 0){
                return 0;
            }
            if(nums[i] - 1 == lastSmaller){
                currentCount++;
                lastSmaller = nums[i];               
            }
            else if(nums[i] != lastSmaller){
                currentCount = 1;
                lastSmaller = nums[i];
            }
            longest = Math.max(longest, currentCount); 
        }
        return longest;
    }
        */

    public static int logestConsecutiveSequence(int [] nums){

        if(nums.length == 0) {
            return 0;
        }
        HashSet<Integer> set = new HashSet<>();

        int longest = 1;
        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }

        for(int num : set){
            if(!set.contains(num - 1)){
                int current = num;
                int count = 1;
                while(set.contains(current + 1)){
                    current++;
                    count++;
                }
            longest = Math.max(longest,count);
            }
        }
        return longest;
     }

    public static void main(String[] args){
        Scanner userNum = new Scanner(System.in);

        System.out.println("Enter the array size : ");
        int size = userNum.nextInt();

        int[] values = new int[size];

        System.out.println("Enter the array values : ");
        for(int i = 0 ; i < size; i++){
            values[i] = userNum.nextInt();
        }
        System.out.println("Longest consecutive sequence is : "+logestConsecutiveSequence(values));

        userNum.close();
    }
}
