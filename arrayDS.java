import java.util.*;
public class arrayDS{
    public static void bubbleSort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j< arr.length-1-i; j++){
                if(arr[j] > arr[j + 1]){
                    //swap
                    arr[j] = arr[j] + arr[j + 1];
                    arr[j + 1] = arr[j] - arr[j + 1];
                    arr[j] = arr[j] - arr[j + 1];
                }
            }
        }
    }

    public static void selectionSort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            int minPos = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[minPos] > arr[j]){
                    minPos = j;
                }
            }
            //swap
            arr[minPos] = arr[minPos] + arr[i]; // 1 + 5 = 6
            arr[i] = arr[minPos] - arr[i] ; // 5 - 1 = 4
            arr[minPos] = arr[minPos] - arr[i];
        }
    }

    public static void printArray(int arr[]){
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]){
        int nums[] = {5, 4, 1, 3, 2};
        selectionSort(nums);
        printArray(nums);
    }
}