import java.util.Scanner;

public class A_04_fibonacci {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();

        int first=1;
        int second=1;
        int next=0;

        if(num==1||num==2 ){
            System.out.println(1);
        }
        else
        {
            for(int i=2;i<num;i++){
                next=first+second;
                first=second;
                second=next;
            }
            System.out.println(next);
        }
    }
}