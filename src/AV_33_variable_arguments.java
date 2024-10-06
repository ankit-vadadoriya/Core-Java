public class AV_33_variable_arguments {
//    static int sum(int a, int b){
//        return a+b;
//    }
//    static int sum(int a, int b, int c){
//        return a+b+c;
//    }
//    static int sum(int a, int b, int c, int d){
//        return a+b+c+d;
//    }

    //-----------------------------or-----------------------

    static int sum(int x, int ...arr){
        //available as int [] arr
        int sum = x;
        for (int a : arr){
            sum = sum+a;
        }
        return sum;
    }
    static int mul(int y, int ...arr){
        //available as int [] arr
        int res = y;
        for (int b : arr){
            res = res*b;
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to varargs tutorial!");
//        System.out.println("The sum of nothing is : " + sum());
        System.out.println("The sum of 1 is : " + sum(1));
        System.out.println("The sum of 4 and 5 is : " + sum(4, 5));
        System.out.println("The sum of 3, 4 and 5 is : " + sum(3, 4, 5));
        System.out.println("The sum of 2, 3, 4 and 5 is : " + sum(2, 3, 4, 5));

        System.out.println(mul(5));
        System.out.println(mul(5,2));
        System.out.println(mul(5,3));
        System.out.println(mul(5, 2, 3));
    }
}
