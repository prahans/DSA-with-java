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

    public static int diagonalSum(int arr[][]){ // brute force
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                if(i == j){
                    sum += arr[i][j];
                }else if(i + j == arr.length-1){
                    sum += arr[i][j];
                }
            }
        }
        return sum;
    }

    public static int diagonalSum1(int arr[][]){ //optimized
        int sum = 0; 
        for(int i=0; i<arr.length; i++){
            sum += arr[i][i];
            if(i != arr.length-1-i){
                sum += arr[i][arr.length-1-i];
            }
            
        }
        return sum;
    }

    //searching or finding target on 2D array or matrix
    public static void findTargetIndex(int arr[][], int target){ // brute froce O(n^2)
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                if(arr[i][j] == target){
                    System.out.println("(" + i + ", " + j + ")");
                }
            }
        }
    }

    public static boolean searchRowWise(int arr[][], int target){ // O(n log n)
        for(int i=0; i<arr.length; i++){
            int l = 0;
            int r = arr[0].length;
            while(l <= r){
                int mid = l + (r - l)/2;
                if(arr[i][mid] == target){
                    System.out.print("(" + i + ", " + mid + ")");
                    return true;
                }else if(arr[i][mid] > target){
                    r = mid -1;
                }else{
                    l = mid +1;
                }
            }
        }
        System.out.print("target doesn't found.");
        return false;
    }

    public static boolean stairCaseSearch(int arr[][], int target){
        int row = 0 , col = arr[0].length -1;
        while(row < arr.length && col >= 0){
            if(arr[row][col] == target){
                System.out.print("(" + row + ", " + col + ")");
                return true;
            }else if(arr[row][col] > target){
                col--;
            }else{
                row++;
            }
        }
        System.out.print("target does't found.");
        return false;
    }

    //Question 1 :Print the number of 7’s that are inthe 2d array.
    public static int qs1(int arr[][]){
        int countOf7 = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                if(arr[i][j] == 7){
                    countOf7++;
                }
            }
        }
        return countOf7;
    }

    //Question 2 :Print out the sum of the numbers inthe second row of the “nums” array
    public static int qs2(int arr[][]){
        int sum = 0;
        for(int i=0; i<arr[0].length; i++){
            sum += arr[1][i];
        }
        return sum;
    }

    //Question 3 :Write a program to FindTranspose of a Matrix.What is Transpose?
    public static void findAndPrintTranspose(int matrix[][]){
        int row = matrix.length , col = matrix[0].length;
        System.out.println("original matrix");
        //printing orignal matrix
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        //transpose the matrix
        int [][] transpose = new int[col][row];
        for(int i=0; i<col; i++){
            for(int j=0; j<row; j++){
                transpose[i][j] = matrix[j][i];
            }
        }
        
        System.out.println("transpose matrix");
        //print transpose
        for(int i=0; i<col; i++){
            for(int j=0; j<row; j++){
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
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
        //sorted matrix in bothwise row & column respectively.
        int matrix3[][] = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {27, 29, 37, 48},
            {32, 33, 39, 50}
        };

        int arrQs1[][] = {
            {4, 7, 8},
            {8, 8, 7}
        };

        int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };

        int [][] matrix4 =  { 
            {2,3,7},
            {5,6,7}
        };

        // System.out.println(diagonalSum(matrix2));
        // findTargetIndex(matrix2, 4);
        // searchRowWise(matrix3, 20);
        // System.out.println(stairCaseSearch(matrix3, 33));
        // System.out.println(qs1(arrQs1));
        // System.out.println("sum = " + qs2(nums));
        findAndPrintTranspose(matrix4);

    }
}