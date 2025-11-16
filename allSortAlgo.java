import java.util.*;
public class allSortAlgo {
    public static void bubbleSort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j] > arr[j+1]){
                    //swap
                    arr[j] = arr[j] + arr[j+1];
                    arr[j+1] = arr[j] - arr[j+1];
                    arr[j] = arr[j] - arr[j+1];
                }
            }
        }
    }

    public static void selectionSort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            int sm = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[sm] > arr[j]){
                    sm = j;
                }
            }
            //swap
            arr[i] = arr[i] + arr[sm];
            arr[sm] = arr[i] - arr[sm];
            arr[i] = arr[i] - arr[sm];
         }
    }

    public static void insertionSort(int arr[]){
        for(int i=1; i<arr.length; i++){
            int curr = arr[i];
            int prev = i-1;
            while(prev >= 0 && arr[prev] > curr){
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }
    }

    public static void insertionSort(int arr[]){
        for(int i=1; i<arr.length; i++){
            int curr = arr[i];
            int prev = i -1;
            while(prev >= 0 && arr[prev] > curr){
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }
    }

    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]){
        int nums [] = {5, 4, 1, 3, 2};
        insertionSort(nums);
        printArray(nums);
    }
}