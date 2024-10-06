class MyNewThr1 extends Thread{
    public void run(){
        int i = 0;
        while (i < 10){
            System.out.println("Thank you");
            try {            //print after 10 seconds
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            i++;
        }
    }
}
class MyNewThr2 extends Thread{
    public void run(){
        int i = 0;
        while (i < 2){
            System.out.println("My Thank you");
            i++;
        }
    }
}

public class AV_75_thread_methods {
    public static void main(String[] args) {
        MyNewThr1 t1 = new MyNewThr1();
        MyNewThr2 t2 = new MyNewThr2();
        t1.start();
        try {
            t1.join();        //first print all t1 statement, after print t2
        }
        catch (Exception e){
            System.out.println(e);
        }
        t2.start();
    }
}
