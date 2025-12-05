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

    // recursion qs 1
    public static void dec(int n){
        if(n == 1){
            System.out.print(n + " ");
            return;
        }
        System.out.print(n + " ");
        dec(n-1);
    }

    // recursion qs 2
    public static void inc(int n){
        if(n == 1){
            System.out.print(n + " ");
            return;
        }
        inc(n -1);
        System.out.print(n + " ");
    }

    // recursion qs 3
    public static int fact(int n){
        if(n == 0){
            return 1;
        }
        return n * fact(n-1);
    }

    // recursion qs 4
    public static int sum(int n){
        if(n == 1){
            return 1;
        }
        return n + sum(n-1);
    }

    // recusion qs 5
    public static int fib(int n){
        if(n == 0 || n == 1){
            return n;
        }
        return fib(n-1) + fib(n -2);
    }

    // recursion qs 6
    public static boolean isSorted(int arr[], int i){
        if(i == arr.length-1){
            return true;
        }
        if(arr[i] > arr[i+1]){
            return false;
        }
        return isSorted(arr,i+1);
    }

    // recursion qs 7
    public static int firstOccurence(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return firstOccurence(arr, key, i+1);
    }

    // recursion qs 8
    public static int lastOccurence(int arr[], int key, int i){
        if(i == -1){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return lastOccurence(arr, key, i-1);
    }

    // recursion qs 9
    public static int lastOccurence2(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }
        int isFound = lastOccurence2(arr, key, i+1);
        if(isFound == -1 && arr[i] == key){
            return i;
        }
        return isFound;
    }

    // recurison qs 10
    public static int power(int a, int n){
        if(n == 0){
            return 1;
        }
        return a * power(a,n-1);
    }

    // recurison qs 11
    public static int optimizedPower(int a, int n){
        if(n == 0){
            return 1;
        }
        int halfPower = optimizedPower(a, n/2);
        int halfPowerSq = halfPower * halfPower;
        // n is odd
        if(n%2 != 0){
            halfPowerSq = halfPowerSq * a;
        }
        return halfPowerSq;
    }

    public static void hollowRec(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i == 1 || j == 1){
                    System.out.print("* ");
                }System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        hollowRec(5);
    }
}