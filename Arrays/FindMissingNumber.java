package Arrays;
import java.util.*;
public class FindMissingNumber {
    public static int findMissingNumber(int[] num){
        int n = num.length;
        int hash[] = new int[n+1];

        for(int i = 0; i < n; i++){
            hash[num[i]] = 1;
        }
        for(int i = 0; i <= n; i++){
            if(hash[i] == 0){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner userNum = new Scanner(System.in);
        System.out.println("Enter the array size :");
        int size = userNum.nextInt();

        int[] values = new int[size];
        System.out.println("Enter the array values :");
        for(int i = 0; i<size; i++){
            values[i] = userNum.nextInt();
        }
        int missing = findMissingNumber(values);
        System.out.println("Missing number is : " + missing);

        userNum.close();
    }
}
