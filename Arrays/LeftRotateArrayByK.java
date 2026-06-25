package Arrays;
import java.util.*;

public class LeftRotateArrayByK {

    //Brute force
    // public static void leftRotateArrayByK(int[] nums, int k){
        
    //     if(nums.length == 0){
    //         return;
    //     }

    //     int n = nums.length;
        
    //     k = k % n;

    //     int[] temp = new int[k];
    //     for(int i= 0; i < k; i++){
    //         temp[i] = nums[i];
    //     }

    //     for(int i = k; i < n; i++){
    //         nums[i-k] = nums[i];
    //     }

    //     for(int i = 0; i < k; i++){
    //         nums[n-k+i] = temp[i];
    //     }
    // }



    //Optimal Solution using Reversal Algorithm
    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
    }

    public static void leftRotateArrayByK(int[] nums, int k) {

        int n = nums.length;

        if (n == 0) {
            return;
        }

        k = k % n;

        // Reverse first k elements
        reverse(nums, 0, k - 1);

        // Reverse remaining elements
        reverse(nums, k, n - 1);

        // Reverse whole array
        reverse(nums, 0, n - 1);
    }

    public static void main(String args[]){

        Scanner mynum = new Scanner(System.in);
        System.out.println("Enter the array size : ");
        int size = mynum.nextInt();

        int[] values = new int[size];
        System.out.println("Enter the array elements :");
        for(int i = 0; i < size; i++){
            values[i] = mynum.nextInt();
        }

        System.out.println("Enter k value to Rotate Array : ");
        int k = mynum.nextInt();

        leftRotateArrayByK(values,k);

        System.out.println("The result is (After left rotation Array by K places) :");

        for(int num : values){
            System.out.print(num + " ");
        }

        mynum.close();
    }
}
