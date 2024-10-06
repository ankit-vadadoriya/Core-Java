class EkClass{
    int a;
    public int returnOne(){
        return 1;
    }
    public EkClass(){
        System.out.println("00000");
    }
    public EkClass(int a) {
//      a = a;    //return 0
//        this.a = a;
        System.out.println("EkClass");
    }

    public int getA() {
        return a;
    }
}

class DoClass extends EkClass{
    int c;

    public DoClass(int c) {
        super(c);
        System.out.println("I am a DoClass constructor");
    }
}

public class AV_47_this_super {
    public static void main(String[] args) {
//        EkClass e = new EkClass(65);
//        System.out.println(e.getA());
        DoClass d = new DoClass(5);
    }
}
