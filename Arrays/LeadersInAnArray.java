package Arrays;
import java.util.*;

public class LeadersInAnArray {
    public static ArrayList<Integer> leaderInAnArray(int[] nums){

        ArrayList<Integer> list = new ArrayList<>();
        int maximum = Integer.MIN_VALUE;
        for(int i = nums.length - 1; i >= 0; i--){
            if(nums[i] > maximum){
                maximum = nums[i];
                list.add(maximum);
            }
        }
        Collections.reverse(list);
        return list;
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

        leaderInAnArray(values);
        ArrayList<Integer> result = leaderInAnArray(values);
        System.out.println("Leaders are: " + result);

        userNum.close();       
    }
}
