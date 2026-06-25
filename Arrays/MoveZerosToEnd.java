package Arrays;
import java.util.*;

public class MoveZerosToEnd {

    // public static void moveZeroToEnd(int[] nums){

    //     ArrayList<Integer> temp = new ArrayList<>();

    //     for(int i = 0; i < nums.length; i++){
    //         if(nums[i] != 0){
    //             temp.add(nums[i]);
    //         }
    //     }

    //     for(int i = 0; i < temp.size(); i++){
    //         nums[i] = temp.get(i);
    //     }
       
    //     for(int i = temp.size(); i < nums.length; i++){
    //         nums[i] = 0;
    //     }
    // } 


    //Optimal Solution using 2 Pointers
    public static void moveZeroToEnd(int[] nums){

       int j = -1;
       for(int i = 0; i < nums.length; i++){
        if(nums[i] == 0){
            j = i;
            break;
        }
       }

       if(j == -1){
        return;
       }

       for(int i = j+1; i < nums.length; i++){
        if(nums[i] != 0){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            j++;
        }
        
       }
       
    }
    public static void main(String args[]){

        Scanner mynum = new Scanner(System.in);

        System.out.println("Enter the array size : ");
        int size = mynum.nextInt();

        int[] values = new int[size];
        System.out.println("Enter the values :");
        for(int i = 0; i < size; i++){
            values[i] = mynum.nextInt();
        }

        moveZeroToEnd(values);

        System.out.print("The result is :");

        for(int num : values){
            System.out.print(num + " ");
        }

        mynum.close();
    }
}
