package Search;

import java.util.Scanner;

public class ExponentialSearch {

    static int binarySearch(int[] nums, int left, int right, int target){
        while(left <= right){
            int mid = (left + right)/2;

            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] < target){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        return -1;
    }

    static int exponentialSearch(int[] nums, int target){
        
        int n = nums.length;

        if(nums.length == 0){
            return 0;
        }

        int i = 0;
        while(i < n && nums[i] <= target){
            i *= 2;
        }
        return binarySearch(nums, i/2, Math.min(i, n-1), target);
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

        System.out.println("The target value present at index: "+exponentialSearch(values,targetValue));
        
        userNum.close();
    }
}
