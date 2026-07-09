package Search;

import java.util.Scanner;

public class FloorandCeil {
    public static int[] floorAndCeil(int[] nums, int target) {
    int low = 0;
    int high = nums.length - 1;

    int floor = Integer.MIN_VALUE;
    int ceil = Integer.MAX_VALUE;

    while (low <= high) {
        int mid = low + (high - low) / 2;

        if (nums[mid] == target) {
            floor = nums[mid];
            ceil = nums[mid];
            break;
        } else if (nums[mid] < target) {
            floor = nums[mid];
            low = mid + 1;
        } else {
            ceil = nums[mid];
            high = mid - 1;
        }
    }

    return new int[]{floor, ceil};
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

        System.out.println("Enter the values to search :");
        int targetValue = userNum.nextInt();

        int[] result = floorAndCeil(values, targetValue);

        System.out.println("Floor = " + result[0]);
        System.out.println("Ceil = " + result[1]);

        userNum.close();
    }
}
