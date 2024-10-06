abstract class Parent{
    public Parent(){
        System.out.println("I am a constructor of Base2");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
    abstract public void greet2();
}
class Child1 extends Parent{
    public Child1(){
        System.out.println("I am Child1");
    }
    @Override
    public void greet(){
        System.out.println("Good Morning");
    }
    public void greet2(){
        System.out.println("Good Afternoon");
    }
    public void th(){
        System.out.println("This is th function");
    }
}
abstract class Child2 extends Child1{
    public void th(){
        System.out.println("I am good");
    }
}

public class AV_53_abstract {
    public static void main(String[] args) {
//        Parent p = new Parent(); //not create object of abstract class
        Child1 c1 = new Child1();
        c1.greet();
        c1.greet2();
        c1.th();
//        Child2 c2 = new Child2(); //not create object of abstract class
    }
}
