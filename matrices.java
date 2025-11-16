import java.util.*;
public class matrices {
    public static void printSpiral(int matrix[][]){
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;
        while(startRow <= endRow && startCol <= endCol){
            //top
            for(int j=startCol; j<=endCol; j++){
                System.out.print(matrix[startRow][j] + " ");
            }
            //right
            for(int j=startRow+1; j<=endRow; j++){
                System.out.print(matrix[j][endCol] + " ");
            }
            //buttom
            for(int j=endCol-1; j>=startCol; j--){
                System.out.print(matrix[endRow][j] + " ");
            }
            //left
            for(int j=endRow-1; j>startRow; j--){
                System.out.print(matrix[j][startCol] + " ");
            }
            startRow++;
            startCol++;
            endCol--;
            endRow--;
        }
    }

    // public static int diagonalSum(int arr[][]){ // brute force
    //     int sum = 0;
    //     for(int i=0; i<arr.length; i++){
    //         for(int j=0; j<arr[0].length; j++){
    //             if(i == j){
    //                 sum += arr[i][j];
    //             }else if(i + j == arr.length-1){
    //                 sum += arr[i][j];
    //             }
    //         }
    //     }
    //     return sum;
    // }

    public static int diagonalSum(int arr[][]){ //optimized
        int sum = 0; 
        for(int i=0; i<arr.length; i++){
            sum += arr[i][i];
            if(i != arr.length-1-i){
                sum += arr[i][arr.length-1-i];
            }
            
        }
        return sum;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int matrix[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        // printSpiral(matrix);

        int matrix2[][] = {
            {0, 1, 2},
            {3, 4, 5},
            {6, 7, 8}
        };
        System.out.println(diagonalSum(matrix2));
    }
}