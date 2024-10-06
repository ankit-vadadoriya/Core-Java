@FunctionalInterface
interface DemoAnony{
    void meth1(int a);
//    void meth2();
}

//class abc implements DemoAnony{
//    public void meth1(){
//        System.out.println("This is method1");
//    }
//}

//class AnonyDemo implements DemoAnony{
//    public void display(){
//        System.out.println("Hello");
//    }
//
//    @Override
//    public void meth1() {
//        System.out.println("meth1");
//    }
//
//    @Override
//    public void meth2() {
//        System.out.println("meth2");
//    }
//}

public class AV_109_lambda {
    public static void main(String[] args) {
//        DemoAnony obj = new AnonyDemo();
//        obj.meth1();
//        obj.meth2();
//        obj.display();    //not allow

//        DemoAnony obj = new DemoAnony() {
//            @Override
//            public void meth1() {
//                System.out.println("I am meth1");
//            }
//
//            @Override
//            public void meth2() {
//                System.out.println("I am meth2");
//            }
//        };
//        obj.meth1();


        //lambda expression

//        DemoAnony obj = new abc();
//        obj.meth1();

        DemoAnony obj = (a) -> {
            System.out.println("I am method 1 from this lambda-" + a);
        };
        obj.meth1(11);
    }
}
