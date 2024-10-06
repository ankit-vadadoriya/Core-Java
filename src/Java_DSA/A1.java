package Java_DSA;
import java.util.Scanner;

public class A1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.print("Enter a character : ");
        char ch = sc.next().charAt(0);

        int charType;
        if (Character.isUpperCase(ch)){
            charType = 1;
        } else if (Character.isLowerCase(ch)) {
            charType = 0;
        } else {
            charType = -1;
        }
        System.out.println(charType);
    }
}
