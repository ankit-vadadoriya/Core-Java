import java.util.Scanner;

class customException extends Exception{
    public String toString() {
        return "Error";
    }
    @Override
    public String getMessage() {
        return "Error";
    }
}

class myException extends Exception{
    public String getMessage() {
        return "Error";
    }
}

public class AV_86_practiceSet {
    public static boolean abc(int z) throws myException{
        if(z >= 5){
            throw new myException();
        }
        System.out.println("Error");
        return false;
    }
    public static void main(String[] args) {
        //problem 1

//        int a = 10     //syntax error
//        System.out.println(a);

//        int age = 78;
//        int year_born = 2000-78;  //logical error
//
//        System.out.println(6/0);    //exception error


        //program 2

//        try {
//            int a = 666/9;
//        }
//        catch (IllegalArgumentException e){
//            System.out.println("Hehe");
//        }
//        catch (ArithmeticException e){
//            System.out.println("Haha");
//        }

        //program 3

        boolean flag = true;
        int [] marks = new int[3];
        marks[0] = 17;
        marks[1] = 25;
        marks[2] = 10;
        Scanner sc = new Scanner(System.in);
        int i = 0;
        while (flag && i < 5){
            try {
                System.out.print("Enter the value of index : ");
                int index = sc.nextInt();
                System.out.println("The value of marks index is : " + marks[index]);
                break;
            }
            catch (Exception e){
                System.out.println("Invalid index");
                i++;
            }
        }
//        if (i >= 5){
////            System.out.println("Error");
//
//            //problem 4
//            try {
//                throw new customException();
//            }
//            catch (Exception e){
//                System.out.println(e.getMessage());
//            }
//        }

        //problem 5
        try {
            System.out.println(abc(5));
        }
        catch (Exception e){
            System.out.println(e);
        }




    }
}
