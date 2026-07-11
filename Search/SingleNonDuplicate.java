package Search;

import java.util.Scanner;

public class SingleNonDuplicate {

    public static int singleDuplicate(int[] nums){
        int n = nums.length;
        if(n == 1) return nums[0];
        if(nums[0] != nums[1]) return nums[0];
        if(nums[n-1] != nums[n-2]) return nums[n-1];

        int low = 1;
        int high = n - 2;

        while(low <= high){
            int mid = low + (high - low)/2;
            if(nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1]) return nums[mid];

            if((mid % 2 == 1 && nums[mid] == nums[mid - 1]) || (mid % 2 == 0 && nums[mid] == nums[mid + 1])){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return -1;
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

        System.out.println("The unique element in the given array is : " + singleDuplicate(values));

        userNum.close();
    }
}
