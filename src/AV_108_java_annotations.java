//functional interfaces can contain only one abstract method
@FunctionalInterface   ///use this annotation to run only one method
interface myFunctionalInterface{
    void thisMethod();
//    void thisMethod2();
}
class NewPhone extends Phone{   //phone class extend from AV_49
    @Override
    public void ShowTime(){
        System.out.println("Time is 8 PM");
    }
    @Deprecated
    public void sum(int a, int b){
        System.out.println(a+b);
    }
    @Deprecated
    public int sum1(int a, int b){
        return a+b;
    }
}

public class AV_108_java_annotations {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        NewPhone phone = new NewPhone();
        phone.ShowTime();    //override method from AV_49
        phone.sum(5,6);
        phone.sum1(5,6);
    }
}
