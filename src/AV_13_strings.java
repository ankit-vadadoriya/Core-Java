import java.util.Scanner;

public class AV_13_strings {
    public static void main(String[] args) {
        //String name = new String("Ankit");
        //System.out.println(name);

        //System.out.print("My name is ");
        //String a = "ankit";
        //System.out.println(a);

        int m = 6;
        float n = 5.6445f;
        System.out.printf("The value of m is %d and value of n is %8.2f \n", m, n); //take 8 spaces and after point take only 2 digit
//        System.out.format("The value of m is %d and value of n is %f", m, n);

        Scanner av = new Scanner(System.in);
        System.out.print("Enter Name : ");
        String name = av.nextLine();
        System.out.println(name);
    }
}
