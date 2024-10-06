public class AV_32_method_overloading {
    static void tellJoke(){
        System.out.println("This is a joke!");
    }
    static void change(int a){
        a = 100;
    }
    static void change2(int [] arr){
        arr[0] = 98;
        arr[1] = 78;
        System.out.println(arr[0]);
        System.out.println(arr[1]);
    }
    static void foo(){
        System.out.println("Good morning bro!");
    }
    static void foo(int a){
        System.out.println("Good morning " + a + " bro!");
    }
    static void foo(int a, int b){
        System.out.println("Good morning " + a + " + " + b + " bro!");
//        System.out.println("Good morning " + b + " bro!");
    }
    public static void main(String[] args) {
//        tellJoke();

        //changing the int
//        int x = 45;
//        change(x);
//        System.out.println("The value of x is after running is : " + x);

        //change the array
        int [] marks = {53, 60, 80, 71, 34, 85};
        change2(marks);
//        System.out.println(marks[0]);

        //method overloading
//        foo();
//        foo(1000);
//
//        int z = 500;
//        foo(z);
//
//        foo(101,201); //arguments are actual!
//
//        int x = 111;
//        int y = 222;
//        foo(x, y);
//
//        foo();
//
//        foo(116);

    }
}
