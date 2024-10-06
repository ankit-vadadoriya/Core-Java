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
class InvalidInputException extends Exception{
    @Override
    public String toString() {
        return "Cannot add 8 & 9";
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}

class CannotDivideByZeroException extends Exception{
    @Override
    public String toString() {
        return "Cannot divide by Zero";
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
class MaxInputException extends Exception{
    @Override
    public String toString() {
        return "Not allowed value more than 100000";
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
class MaxMultyplyInputException extends Exception{
    @Override
    public String toString() {
        return "Input can't be greater than 7000 while multiplying";
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
class customCalculator{
    double add(double a, double b) throws InvalidInputException, MaxInputException {
        try {
            if (a > 100000 || b > 100000){
                throw new MaxInputException();
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        if (a == 9 || a == 8){
            throw new InvalidInputException();
        }
        return a + b;
    }
    double subtract(double a, double b) throws MaxInputException{
        if (a > 100000 || b > 100000){
            throw new MaxInputException();
        }
        return a - b;
    }
    double multiply(double a, double b) throws MaxInputException, MaxMultyplyInputException{
        if (a > 100000 || b > 100000){
            throw new MaxInputException();
        } else if (a > 7000 || b > 7000) {
            throw new MaxMultyplyInputException();
        }
        return a * b;
    }
    double divide(double a, double b) throws CannotDivideByZeroException, MaxInputException{
        if (a > 100000 || b > 100000){
            throw new MaxInputException();
        }
        if (b == 0){
            throw new CannotDivideByZeroException();
        }
        return a / b;
    }
}

public class AV_103_calculator {
    public static void main(String[] args) throws InvalidInputException, CannotDivideByZeroException, MaxInputException, MaxMultyplyInputException {
        customCalculator cc = new customCalculator();
        cc.add(9,8);
//        cc.subtract(10, 5);
//        cc.multiply(10,700);
//        cc.divide(6,0);
    }
}
