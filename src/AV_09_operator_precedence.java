public class AV_09_operator_precedence {
    public static void main(String[] args) {
        // precedence & associativity
        int a = 5*6-30/2;
        /* highest precedence goes to * and /.they evaluated on
           the basis of left to right associatibity.
           = 30-30/2
           = 30-15
           = 15
         */
        System.out.println(a);

        int b = 60/5-30*2;
        /* = 12-30*2
           = 12-60
           = -48
           * and / are have same precedence, so execute in left to right
         */
        System.out.println(b);

        // quick quiz
        int m = 6;
        int n = 1;
        int o = m * n/2;
        System.out.println(o);

        int x = 1;
        int y = 4;
        int z = 5;
        int res = (x*x - 4*z*y)/(2*z);
        System.out.println(res);

        // increment and decrement operators
        int i = 80;
        System.out.println(i++);
        System.out.println(i);
        System.out.println(++i);
        System.out.println(i);

        char abc = 'a';
        System.out.println(++abc);

        int aa = 10;
        int bb = ++aa * 2;
        int cc = 10;
        int dd = cc++ * 2;
        System.out.println(bb);
        System.out.println(dd);
    }
}
