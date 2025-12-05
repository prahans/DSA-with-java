public class RecursionBasic {
    public static void printDec(int n){
        if(n == 1){
            System.out.print(n);
            return;
        }
        System.out.print(n+ " ");
        printDec(n-1);
    }

    public static void printInc(int n){
        if(n == 1){
            System.out.print(n+" ");
            return;
        }
        printInc(n - 1);
        System.out.print(n+" ");
    }

    public static int fact(int n){
        if(n == 0){
            return 1;
        }
        int fmn = fact(n -1);
        int fn = n * fmn;
        return fn;
    }

    // public static int sum(int n){
    //     if(n == 1){
    //         return 1;
    //     }
    //     int smn = sum(n-1);
    //     int sumN = n + smn;
    //     return sumN;
    // }

    //calculate nth term in fibonacci
    public static int fib(int n){
        if(n == 0 || n == 1){
            return n;
        }
        int fnm1 = fib(n-1);
        int fnm2 = fib(n-2);
        int fn = fnm1 + fnm2;
        return fn;
    }

    //check given array is sorted or not
    public static boolean isSorted(int arr[], int i){
        if(i == arr.length -1){
            return true;
        }

        if(arr[i] > arr[i + 1]){
            return false;
        }

        return isSorted(arr, i+1);
    }

    public static int firstOccurence(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }
        if(key == arr[i]){
            return i;
        }
        return firstOccurence(arr, key, i+1);
    }

    public static int lastOccurence(int arr[], int key, int i){
        if(i == -1){
            return i;
        }
        if(arr[i] == key){
            return i;
        }
        return lastOccurence(arr, key, i-1);
    }

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

    public static int power(int x, int n){
        if(n == 0){
            return 1;
        }
        return x * power(x,n-1);
    }

    public static int optimizedPower(int a, int n){ // O(log n)
        if(n == 0){
            return 1;
        }

        int halfPower = optimizedPower(a, n/2);
        int halfPowerSq = halfPower * halfPower;

        //n is odd
        if(n%2 != 0){
            halfPowerSq = halfPowerSq * a;
        }

        return halfPowerSq;
    }

    public static int tilingProblem(int n){
        //base case
        if(n == 0 || n == 1){
            return 1;
        }

        //kaam
        //vertical choice
        int fnm1 = tilingProblem(n-1);

        //horizontal choice
        int fnm2 = tilingProblem(n-2);

        return fnm1 + fnm2;
    }

    public static void removeDuplicate(String str, int idx, StringBuilder newStr, boolean map[]){
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(idx);
        if(map[currChar - 'a'] == true){
            removeDuplicate(str, idx+1, newStr, map);
        }else{
            map[currChar - 'a'] = true;
            removeDuplicate(str, idx+1, newStr.append(currChar), map);
        }
    }

    public static int sum(int n){
        if(n == 1){
            return n;
        }

        return n + sum(n-1);
    }

    public static void main(String args []){
        // System.out.println(tilingProblem(5));
        // System.out.println(optimizedPower(2,5));
        // System.out.println(power(2,2));
        // int arr[] = {8, 3, 6, 9, 5, 10, 2, 5, 3};
        // System.out.println(firstOccurence(arr, 5, 0));
        // System.out.println(lastOccurence2(arr, 5, 0));
        // printDec(10);
        // System.out.println();
        // printInc(10);
        // System.out.println(fact(5));
        // System.out.println(sum(5));
        // System.out.println(fib(25));

        // String str = "appnnacollege";
        // removeDuplicate(str, 0, new StringBuilder(""), new boolean [26]);

        System.out.println(sum(20));
    }
}