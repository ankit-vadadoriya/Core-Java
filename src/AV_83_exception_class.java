import java.util.Scanner;

class MyException1 extends Exception{
    @Override
    public String toString() {
        return super.toString() + "I am toString";
    }

    @Override
    public String getMessage() {
        return "I am getMessage";
    }
}
class MaxAgeException extends Exception{
    @Override
    public String toString() {
        return "Age cannot be greater than 99";
    }

    @Override
    public String getMessage() {
        return "Make sure that entered value is correct";
    }
}

public class AV_83_exception_class {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a = sc.nextInt();
        if (a < 99){
            try{
                throw new MyException1();
//                throw new ArithmeticException("This is an exception");
            }
            catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                e.printStackTrace();  //thorw error
                System.out.println("Finished!");
            }
            System.out.println("Yes Finished!");
        }
    }
}