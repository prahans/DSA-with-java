import java.util.*;
public class pattern{
    public static void hollowRectangle(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i == 1 || i == n || j == 1 || j  == n){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        
    }

    public static void invertedAndRotatedHalfPyramid(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i + j >= n + 1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void invertedHalfPyramid(int n){
        for(int i=1; i<=n; i++){
            int num = 1;
            for(int j=1; j<=n; j++){
                if(i + j <= n+1){
                    System.out.print(num + " ");
                    num++;
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void floydsTriangle(int n){
        int num = 1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(j <= i){
                    System.out.print(num + " ");
                    num++;
                }
            }
            System.out.println();
        }
    }

    public static void triange01(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(j <= i){
                    if((i + j)%2 == 0){
                        System.out.print("1 ");
                    }else{
                        System.out.print("0 ");
                    }
                }
            }
            System.out.println();
        }
    }

    public static void butterfly(int n){
        // 1st half
        for(int i=1; i<=n; i++){
            //stars
            for(int j=1; j<=i; j++){
                    System.out.print("*");
            }

            //space
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }

            //star
            for(int j=1; j<=i; j++){
                    System.out.print("*");
            }

            System.out.println();
        }

        // 2nd half
        for(int i=n; i>=1; i--){
            //stars
            for(int j=1; j<=i; j++){
                    System.out.print("*");
            }

            //space
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }

            //star
            for(int j=1; j<=i; j++){
                    System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void soildRhombus(int n){
        for(int i=1; i<=n; i++){
            //space
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            //star
            for(int j=1; j<=n; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void hollowRhombus(int n){
            for(int i=1; i<=n; i++){
                //space
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            //star
            for(int j=1; j<=n; j++){
                if(i == 1 || i == n || j == 1 || j == n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }

            System.out.println();
            }
    }

    public static void dimond(int n){
        //1st half
        for(int i=1; i<=n; i++){
            //space
            for(int j=1; j<=n-i; j++){
                System.out.print("  ");
            }

            //star
            for(int j=1; j<=2*i - 1; j++){
                System.out.print("* ");
            }

            System.out.println();
        }

        //2nd half
        for(int i=n; i>=1; i--){
            //space
            for(int j=1; j<=n-i; j++){
                System.out.print("  ");
            }

            //star
            for(int j=1; j<=2*i - 1; j++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    public static void main(String args[]){
        // hollowRectangle(5);
        // invertedAndRotatedHalfPyramid(5); 
        // invertedHalfPyramid(5); // with number
        // floydsTriangle(5);
        // triange01(5);
        // butterfly(5);
        // soildRhombus(5);
        // hollowRhombus(5);
        dimond(5);
    }
}