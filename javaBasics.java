public class javaBasics {
    public static void printMyName(int n){
        for(int row = 0; row < n; row++){
            // A
            for(int col = 0; col < n; col++){
                if(row == 0  || col == 0 || col == n-1 || row == n/2){
                    System.out.print("*" + " ");
                }else{
                    System.out.print("  ");
                }
            }

            for(int space=0; space<n; space++){
                System.out.print(" ");
            }

            // N
            for(int col = 0; col < n; col++){
                if(col == 0 || col == n-1 || col == row){
                    System.out.print("*" + " ");
                }else{
                    System.out.print("  ");
                }
            }

            for(int space=0; space<n; space++){
                System.out.print(" ");
            }

            // U
            for(int col = 0; col < n; col++){
                if(row == n-1 || col == 0 || col == n-1){
                    System.out.print("*" + " ");
                }else{
                    System.out.print("  ");
                }
            }

            for(int space=0; space<n; space++){
                System.out.print(" ");
            }

            // R
            for(int col = 0; col < n; col++){
                if(row == 0 || col == 0 || row == n/2 || col == n-1 && row <= n/2 || row == col && row >= n/2){
                    System.out.print("*" + " ");
                }else{
                    System.out.print("  ");
                }
            }

            for(int space=0; space<n; space++){
                System.out.print(" ");
            }

            //A
            for(int col = 0; col < n; col++){
                if(row == 0  || col == 0 || col == n-1 || row == n/2){
                    System.out.print("*" + " ");
                }else{
                    System.out.print("  ");
                }
            }

            for(int space=0; space<n; space++){
                System.out.print(" ");
            }

            //G
            for(int col = 0; col < n; col++){
                if(row == 0 || col == 0 || row == n-1 || col == n-1 && row >= n/2 || row == n/2 && col >= n/2){
                    System.out.print("*" + " ");
                }else{
                    System.out.print("  ");
                }
            }


            System.out.println();
        }
    }

    public static void main(String args[]){
        printMyName(9);
    }
}