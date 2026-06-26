package Arrays;
import java.util.*;

public class UnionOfTwoSortedArrays {
    /*
    //brute force solution
    public static void unionOfTwoSortedArrays(int[] num1, int[] num2){

        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i<num1.length; i++){
            set.add(num1[i]);
        }

        for(int i = 0; i<num2.length; i++){
            set.add(num2[i]);
        }
            System.out.println(set);
        
    }*/

    
    public static void unionOfTwoSortedArrays(int[] num1, int[] num2){

        ArrayList<Integer> unionResult = new ArrayList<>();

        int i = 0 , j = 0;
        int n1 = num1.length , n2 = num2.length;

        while(i<n1  && j<n2){
            if(num1[i] <= num2[j]){
                if(unionResult.size() == 0 || unionResult.get(unionResult.size() -1) != num1[i]){
                    unionResult.add(num1[i]);
                }
                i++;
            }
            else{
                if(unionResult.size() == 0 || unionResult.get(unionResult.size() -1) != num2[j]){
                    unionResult.add(num2[j]);
                }
                j++;
            }
        }
        while(i<n1){
            if(unionResult.size() == 0 || unionResult.get(unionResult.size() -1) != num1[i]){
                unionResult.add(num1[i]);
            }
            i++;
        }
        while(j<n2){
            if(unionResult.size() == 0 || unionResult.get(unionResult.size() -1) != num2[j]){
                unionResult.add(num2[j]);
            }
            j++;
        }
        System.out.print(unionResult);
        //return unionResult;
    }

    public static void main(String args[]){

        Scanner userNum = new Scanner(System.in);

        System.out.println("Enter Array size for first array :");
        int size1 = userNum.nextInt();
        
        int[] values1 = new int[size1];
        System.out.println("Enter the values for first array :");
        for(int i = 0; i < size1; i++){
            values1[i] = userNum.nextInt();
        }

        System.out.println("Enter Array size for second array");
        int size2 = userNum.nextInt();

        int[] values2 = new int[size2];
        System.out.println("Enter the values for second array :");
        for(int i = 0; i < size2; i++){
            values2[i] = userNum.nextInt();
        }

        unionOfTwoSortedArrays(values1, values2);

        userNum.close();
    }
}
