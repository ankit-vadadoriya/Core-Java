class MyThreadRunnable1 implements Runnable{
    public void run(){
        for (int i = 1; i <= 5; i++){
            System.out.println("I am a thread 1 not a threat 1");
        }
    }
}
class MyThreadRunnable2 implements Runnable{
    public void run(){
        for (int i = 1; i <= 5; i++){
            System.out.println("I am a thread 2 not a threat 2");
        }
    }
}

public class AV_71_runnable {
    public static void main(String[] args) {
//        MyThreadRunnable1 bullet1 = new MyThreadRunnable1();
//        Thread gun1 = new Thread(bullet1);
        //-----------------OR-----------------
        Thread gun1 = new Thread(new MyThreadRunnable1());

        MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();
    }
}

