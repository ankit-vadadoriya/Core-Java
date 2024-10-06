import java.util.Scanner;

public class AV_35_practiceSet_on_methods {
    static void mul(int n){
//        int n1 = n;
//        int answer1;
//        for (int i=1; i<=10; i++){
//            answer1 = n1 * i;
//            System.out.println(n1 + " * " + i + " = " + answer1);
//        }
        //----------OR----------
        for (int i=1; i<=10; i++){
            System.out.format("%d * %d = %d\n", n, i, n*i);
        }
    }

//--------------------------------------------------------------------------
    static void pattern1(int n){
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

//-------------------------------------------------------------------------
    //sum(n) = 1 + 2 + 3 + ..... + n
    static int sumRec(int n){
        if(n==1){
            return 1;
        }
        else {
//            int res = 0;
//            for (int i=1; i<=n; i++){
//                res = res + i;
//            }
//            return res;
            //--------OR---------
            return n + sumRec(n-1);
        }
    }

//--------------------------------------------------------------------------
    static void pattern2(int n){
        for (int i=1; i<=n; i++){
            for (int j=n; j>=i; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

//--------------------------------------------------------------------------
    //fibonacci => 0, 1, 1, 2, 3, 5, 8, 13......
    static void fibonacci(int n){
//        int n1 = 0;    //if fibonacci series start with 0
        int n1 = 1;      //if fibonacci series start with 1
        int n2 = 1;
        for (int i=1; i<=n; i++){
            System.out.print(n1 + ", ");
            int n3 = n2 + n1;
            n1 = n2;
            n2 = n3;
        }
        System.out.println();
    }
    //--------------OR-----------------
    static int fibonacci1(int n){
        if (n==0){
            return 0;
        }
        else if (n==1){
            return 1;
        }
        else {
            return fibonacci1(n-1) + fibonacci1(n-2);
        }
    }

//--------------------------------------------------------------------------
//    static float avgNum(float l, float [] arr){
//        float sum = 0;
//        float avg;
//        for (float num : arr){
//            sum = sum + num;
//        }
//        return sum/l;
//    }

    static int avgNum(int ...arr){
        int sum = 1;
        for (int ele : arr){
            sum += ele;
        }
        return sum;
    }

//-------------------------------------------------------------------------

    static void pattern2Rec(int n){
        if (n>0){
            for (int i=1; i<=n; i++){
                System.out.print("* ");
            }
            System.out.println();
            pattern2Rec(n-1);
        }
    }

//-------------------------------------------------------------------------

    static void pattern1Rec(int n){
        if (n>0){
            pattern1Rec(n-1);
            for (int i=1; i<=n; i++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

//    ---------------------------------------------------------------------
    static float celToFeh(float n){
        float feh;
        feh = (n * 9/5) + 32;
        return feh;
    }

//=========================================================================
    public static void main(String[] args) {

        //(1). multiplication of n numbers
        mul(10);


        //(2). print pattern
        pattern1(4);


        //(3). sum of n natural number
        int a = 5;
        System.out.println("sum of " + a + " number is : " + sumRec(a));
        //----------OR----------
//        int a = sumRec(5);
//        System.out.println("sum of " + a + " number is : " + a);


        //(4). print pattern
        pattern2(4);


        //(5). fibonacci series
        fibonacci(10);
        //---------OR---------
        int result = fibonacci1(5);
        System.out.println("last digit of n fibonacci series : " + result);


        //(6). find average of a set of numbers
        int [] arr = {3, 5, 22, 9, 19, 11, 20};
//        float l = arr.length;
        int res = avgNum(arr);
        System.out.println("Average : " + res);


        //(7). pattern 4 using recursion
        pattern2Rec(4);


        //(8). pattern 2 using recursion
        pattern1Rec(4);


        //(9). celcius to fahrenheit
//        float cel = celToFeh(31);
//        System.out.println("Fahrenheit : " + cel);
        //----------------OR--------------

        Scanner av = new Scanner(System.in);
        System.out.print("Enter celcius : ");
        float cel = av.nextFloat();
//        float cel = 25;
        System.out.println("Fahrenheit : " + celToFeh(cel));

    }
}
