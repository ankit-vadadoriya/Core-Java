public class AV_23_for_loop {
    public static void main(String[] args) {
        System.out.println("Foor loop");
        for(int i=1; i<=10; i++){
            System.out.println(i);
        }

        int n = 10;
        System.out.println("Odd number : ");
        for (int a=0; a<n; a++){
            System.out.println(a*2+1);
        }

        System.out.println("Decrementing for loop");
        int m = 10;
//        for (int b=m; b>0; b--){
//            System.out.println(b);
//        }
        //-------------OR-------------
        for (int b=m; b!=0; b--){
            System.out.println(b);
        }

        System.out.println("break and continue using loop");
        for (int ab=1; ab<=10; ab++){
            System.out.println(ab);
            System.out.println("Java is great");
        }
    }
}
