package Arrays;
import java.util.*;

public class BestTimeToBuyAndSellStock {
    public static int bestTimeToBuyAndSellStock(int[] nums){
        int minimumValue = nums[0];
        int maxProfit = 0;
        
        for(int i = 0; i < nums.length; i++){
            int cost = nums[i] - minimumValue;
            maxProfit = Math.max(maxProfit, cost);
            minimumValue = Math.min(minimumValue, nums[i]);
        }
        return maxProfit;
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
        int result = bestTimeToBuyAndSellStock(values);
        System.out.println("The max profit is : " + result);

        userNum.close();
    }
}
