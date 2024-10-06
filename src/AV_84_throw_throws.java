class NegativeRadiusException extends Exception{
    @Override
    public String toString() {
        return "Negative radius cannot be allow";
    }

    @Override
    public String getMessage() {
        return "I am getMessage";
    }
}

public class AV_84_throw_throws {
    public static int divied(int a, int b) throws ArithmeticException{
        //made by ankit
        int result = a/b;
        return result;
    }
    public static double area(int r) throws NegativeRadiusException{
        if (r<0){
            throw new NegativeRadiusException();
        }
        double result = Math.PI * r * r;
        return result;
    }

    public static void main(String[] args) {
        //shivam  - uses divied function created by ankit
        try{
            int c = divied(6,0);
            System.out.println(c);
        }
        catch (Exception e){
            System.out.println("Exception");
        }

        try {
            double ar = area(-5);
            System.out.println(ar);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
