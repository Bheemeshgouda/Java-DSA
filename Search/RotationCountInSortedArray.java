package Search;

import java.util.Scanner;

public class RotationCountInSortedArray {
    public static int rotationCountInSortedArray(int[] nums){
        int low = 0;
        int high = nums.length - 1;
        int minimum = Integer.MAX_VALUE;
        int index = -1;

        while(low <= high){
            if(nums[low] <= nums[high]){
                if(nums[low] < minimum){
                    minimum = nums[low];
                    index = low;
                }
                break;
            }
            int mid = low + (high - low)/2;
            if(nums[low] <= nums[mid]){
                if(nums[low] < minimum){
                    minimum = nums[low];
                    index = low;
                }
                low = mid + 1;
            }
            else{
                if(nums[mid] < minimum){
                    minimum = nums[mid];
                    index = mid;
                }
                high = mid - 1;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        Scanner userNum = new Scanner(System.in);
        System.out.println("Enter the array size : ");
        int size = userNum.nextInt();

        int[] values = new int[size];
        System.out.println("Enter the array values : ");
        for (int i = 0; i < size; i++) {
            values[i] = userNum.nextInt();
        }

        System.out.println("The Array rotation count is : " + rotationCountInSortedArray(values));

        userNum.close();
    }
}
