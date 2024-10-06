import java.util.Scanner;
import java.util.concurrent.LinkedTransferQueue;

/* you have to create a custom calculator with following operations :
        1. + -> addition
        2. - -> subtraction
        1. + -> multiplication
        1. + -> division
        which throws the following exception :
        1. Invalid input exception   ex: 8 & 9
        2. Cannot divide by 0 Exception
        3. Max Input Exception if any of the inputs is greater than 100000
        4. Max multiplication reached Exception - don't allow any multiplication
                                                  input to be greater than 7000
         */
class maxInput extends Exception{
    @Override
    public String getMessage() {
        return "Not allowed value more than 100000";
    }
}
class maxInputMulti extends Exception{
    @Override
    public String getMessage() {
        return "Not allow more than 7000 value in multiplication";
    }
}

public class AV_87_custom_calculator {
    public static void main(String[] args) {

        char operator;
        double total;
        double num1, num2;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        num1 = sc.nextDouble();
        while (num1 > 100000){
            try {
                throw new maxInput();
            }
            catch (Exception e){
                System.out.println(e.getMessage());
                System.exit(0);
            }
        }

        System.out.print("Enter the second number : ");
        num2 = sc.nextDouble();
        while (num2 > 100000){
            try {
                throw new maxInput();
            }
            catch (Exception e){
                System.out.println(e.getMessage());
                System.exit(0);
            }
        }

        System.out.print("Choose an operator : +, -, * or / : ");
        operator = sc.next().charAt(0);


        switch (operator){
            case '+' : total = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + total);
                        break;
            case '-' : total = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + total);
                break;
            case '*' :
                if (num1 > 7000 || num2 > 7000){
                    try {
                        throw new maxInputMulti();
                    }
                    catch (Exception e){
                        System.out.println(e.getMessage());
                        System.exit(0);
                    }
                }
                else {
                    total = num1 * num2;
                    System.out.println(num1 + " * " + num2 + " = " + total);
                    break;
                }
            case '/' :
                if (num2 == 0) {
                    try {
                        throw new ArithmeticException("Cannot divide by 0");
                    } catch (Exception e) {
                        System.out.println(e);
                        System.exit(0);
                    }
                }
                else {
                    total = num1 / num2;
                    System.out.println(num1 + " / " + num2 + " = " + total);
                    break;
                }
            default :
                try {
                    throw new IllegalArgumentException("Invalid operator");
                }
                catch (Exception e){
                    System.out.println(e);
                }
        }
    }
}
