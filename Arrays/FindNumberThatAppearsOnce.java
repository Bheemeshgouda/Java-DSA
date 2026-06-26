package Arrays;
import java.util.*;
public class FindNumberThatAppearsOnce {
    public static int findNumberThatAppearsOnce(int[] nums){
        int xor = 0;
        for(int i = 0; i < nums.length; i++){
            xor = xor ^ nums[i];   
        }
        return xor;
    }

    public static void main(String[] args){
        Scanner userNum = new Scanner(System.in);
        System.out.println("Enter the array size : ");
        int size = userNum.nextInt();

        int[] values = new int[size];
        System.out.println("Enter the values : ");
        for(int i = 0; i<size;  i++){
            values[i] = userNum.nextInt();
        }
        System.out.println("Number that appears once in a given array is :" + findNumberThatAppearsOnce(values));

        userNum.close();
    }
}
