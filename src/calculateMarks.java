import java.util.Scanner;

public class calculateMarks {
    public static void main(String[] args) {

      Scanner av = new Scanner(System.in);

        System.out.print("Total marks of subject : ");
        int tmos = av.nextInt();
        int totalMarks = tmos * 5;

        System.out.print("1st Subject Marks : ");
        float m1 = av.nextFloat();
        System.out.print("2nd Subject Marks : ");
        float m2 = av.nextFloat();
        System.out.print("3rd Subject Marks : ");
        float m3 = av.nextFloat();
        System.out.print("4th Subject Marks : ");
        float m4 = av.nextFloat();
        System.out.print("5th Subject Marks : ");
        float m5 = av.nextFloat();

        float sum = m1 + m2 + m3 + m4 + m5;
        float result = (100*sum)/totalMarks;
        System.out.println("Percentage is : " + result + "%");
    }
}
