package Arrays;
import java.util.*;

public class IntersectionOfTwoSortedArrays {

    /*//Brute force
    public static void intersectionOfTwoSortedArrays(int[] num1, int[] num2){
       int n1 = num1.length , n2 = num2.length;
       
       ArrayList<Integer> intersectionResult = new ArrayList<>();
       int[] visited = new int[n2];
       for(int i = 0; i < n1; i++){
        for(int j = 0; j < n2; j++){
            if(num1[i] == num2[j] && visited[j] == 0){
                intersectionResult.add(num1[i]);
                visited[j] = 1;
                break;
            }
            if(num2[j] > num1[i]){
                break;
            }
        }
        
       }
       System.out.print(intersectionResult);
    } */


    //Optimal Solution
    public static void intersectionOfTwoSortedArrays(int[] num1, int[] num2){
        int n1 = num1.length, n2 = num2.length, i = 0, j = 0;

        ArrayList<Integer> result = new ArrayList<>();

        while(i < n1 && j < n2){
            if(num1[i] < num2[j]){
                i++;
            }
            else if(num2[j] < num1[i]){
                j++;
            }
            else{
                result.add(num1[i]);
                i++;
                j++;
            }
        }
        System.out.print(result);
    }    

    public static void main(String[] args){

        Scanner userNum = new Scanner(System.in);
        System.out.println("Enter the array size for first array :");
        int size1 = userNum.nextInt();

        int[] values1 = new int[size1];
        System.out.println("Enter the values for first array :");
        for(int i = 0; i<size1; i++){
            values1[i] = userNum.nextInt();
        }

        System.out.println("Enter the array size for second array :");
        int size2 = userNum.nextInt();

        int[] values2 = new int[size2];
        System.out.println("Enter the values for second array :");
        for(int i = 0; i<size2; i++){
            values2[i] = userNum.nextInt();
        }

        intersectionOfTwoSortedArrays(values1, values2);

        userNum.close();
     }
}
