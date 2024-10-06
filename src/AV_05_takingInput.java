import java.util.Scanner;

public class AV_05_takingInput   {
    public static void main(String[] args) {
        System.out.println("Taking input from the user : ");
        Scanner av = new Scanner(System.in);
//        System.out.println("Enter number 1");
//        int a = av.nextInt();
//        System.out.println("Enter number 2");
//        int b = av.nextInt();
//        int sum = a + b;
//        System.out.print("The sum of these numbers is : ");
//        System.out.println(sum);

//        boolean b1 = av.hasNextInt();
//        System.out.println(b1);

//        String str = av.next();
        String str = av.nextLine();
        System.out.println(str);
    }
}
