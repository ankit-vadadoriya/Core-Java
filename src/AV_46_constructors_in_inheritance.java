class Base1{
    Base1(){
        System.out.println("I am a constructor");
    }
    Base1(int x){
        System.out.println("I am a constructor with value of x as : " + x);
    }
    Base1(int x, int y){
        System.out.println("I am a constructor with value of x and y as : " + x + " " + y);
    }
}

class Derived1 extends Base1{
    Derived1(){
//        super(0);
        System.out.println("I am a derived1 class constructor");
    }
    Derived1(int x){
//        super(x);
        System.out.println("I am a derived1 class constructor" + x);
    }

    Derived1(int x, int y){
        super(x);
        System.out.println("I am an overloaded constructor of Derived1 with value of y as : " + y);
    }
}

class childOfDerived extends Derived1{
    childOfDerived(){
        System.out.println("I am a childOfDerived constructor");
    }
    childOfDerived(int x, int y){
        super(x);
        System.out.println("I am a childOfDerived constructor" + y);
    }
    childOfDerived(int x, int y, int z){
        super(x,y);
        System.out.println("I am an overloaded constructor of childOfDerived with value of y as : " + z);
    }
}

public class AV_46_constructors_in_inheritance {
    public static void main(String[] args) {
//        Base1 b = new Base1();
//        Base1 b = new Base1(10);
//        Derived1 d = new Derived1();
//        Derived1 d = new Derived1(14,9);
        childOfDerived gc = new childOfDerived(10,11, 12);

    }
}
