class sum{
    public void mySum(int a, int b){
        int c = a + b;
        System.out.println(c);
    }
}

public class AV_31_methods {
    static int logic(int x, int y){
        int z;
        if (x>y){
            z = x + y;
        }
        else {
            z = (x + y) * 5;
        }
        return z;
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int c;
//        method invocation using object creation_____
//        AV_31_methods obj = new AV_31_methods();
//        c = obj.logic(a,b);
        c = logic(a,b);
        System.out.println(c);

        int a1 = 2;
        int b1 = 1;
        int c1;
//        c1 = obj.logic(a1,b1);
        c1 = logic(a1,b1);
        System.out.println(c1);

        sum s = new sum();
        s.mySum(10,20);
    }

}
