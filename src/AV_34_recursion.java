public class AV_34_recursion {
    //factorial(0) = 1;
    //factorial(n) = n * n-1 * ... 1
    //factorial(5) = 5 * 4 * 3 * 2 * 1
    //factorial(n) = n * factorial(n-1)
    static int factorial(int n){
        if(n==0||n==1){
            return 1;
        }
        else {
            return n * factorial(n-1);
        }
    }
    static int factorial_iterative(int n){
        if(n==0||n==1){
            return 1;
        }
        else {
            int product = 1;
            for (int i=1; i<=n; i++){
                product = product * i;
            }
            return product;
        }
    }

    static void fibonacci(int n){
        int n1 = 0;
        int n2 = 1;
        for (int i=0; i<n; i++){
            System.out.print(n1 + ", ");
            //swap
            int n3 = n2 + n1;
            n1 = n2;
            n2 = n3;
        }
    }
    static int sum(int a){
        if (a > 0){
            return a + sum(a-1);
        }
        else {
            return 0;
        }
    }

    public static void main(String[] args) {
        int x = 4;
        System.out.println("The value of factorial " + x + " is : " + factorial(x));

        int y = 5;
        System.out.println("The value of factorial " + y + " is : " + factorial_iterative(y));

//        int z = 5;
        System.out.print("Fibonacci : ");
        fibonacci(10);

        int ab = 10;
        System.out.println("Sum : " + sum(ab));
    }
}
