import java.util.Scanner;

public class AV_79_errorsdemo {
    public static void main(String[] args) {
//        syntax error
        //int a = 0      //error: no semicolon
        //b = 1;         //error: b not declared!

//        logical error
        //write a program to print a all prime numbers between 1 to 10
        System.out.println(2);
        for (int i = 1; i < 5; i++){
            System.out.println(2*i+1);
            //ans : 2,3,5,7,9    //logical error because 9 is not prime number
        }

//        runtime error
        int k;
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        System.out.println("Integer part of 1000 divided by k is : " + 1000/k);
        //error : divided by 0 is not allowed
    }
}
