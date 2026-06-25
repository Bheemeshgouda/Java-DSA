package Arrays;
import java.util.*;

public class Sorting{

    static void selection_sort(int arr[]){
        for(int i=0; i<arr.length; i++){
            int min = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
                
            }
            int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            
        }
    }


    static void bubble_sort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            boolean swapped = false;
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }


    static void insertion_sort(int arr[]){
        for(int i = 0; i<arr.length; i++){
            int j = i;
            while(j > 0 && arr[j-1] > arr[j]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
    }
    public static void main(String [] args){
        Scanner mynum = new Scanner(System.in);
        System.out.println("Enter the array size :");
        int size = mynum.nextInt();

        int values[] = new int[size];
        System.out.println("Enter the array values :");
        for(int i=0; i<size; i++){
            values[i] = mynum.nextInt();
        }
        //selection_sort(values);
        //bubble_sort(values);
        insertion_sort(values);
        
        System.out.println("Sorted array:");
        for(int num : values){
            System.out.print(num + " ");
        }
        System.out.println();

        mynum.close();
    }
}