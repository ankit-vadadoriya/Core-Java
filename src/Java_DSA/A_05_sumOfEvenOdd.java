package Java_DSA;
import java.util.*;

public class A_05_sumOfEvenOdd {
    public static void main(String[] args) {
//        int[] arr = {1,2,5,4,3,8};
//        int evenSum = 0;
//        int oddSum = 0;
//        for (int i = 0; i < arr.length; i++){
//            if ((arr[i]%2) == 0){
//                evenSum += arr[i];
//            }
//            else {
//                oddSum += arr[i];
//            }
//        }
//        System.out.println("Even number sum : " + evenSum);
//        System.out.println("Odd number sum : " + oddSum);

        //------------------------------------OR--------------------------------

        Scanner sc = new Scanner(System.in);
        int d=sc.nextInt();

        int a=0;
        int b=0;
        while(d !=0){
            int r=d%10;
            System.out.println("r : " + r);
            if(r%2==0){
                a+=r;
            }
            else{
                b+=r;
            }
            d = d/10;
        }
        System.out.println(a+" "+b);
    }
}
