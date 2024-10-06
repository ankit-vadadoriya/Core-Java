
class MyThr extends Thread{
    public MyThr(String name){
        super(name);
    }
    public void run(){
        int i = 34;
        System.out.println("Thank you");
//        while (i < 5){
//            System.out.println("I am a Thread");
//            i++;
//        }
    }
}
class MyThr2 implements Runnable{
    public String name;
    public MyThr2(String name){
        this.name = name;
    }
    public void run(){
//        int i = 1;
//        System.out.println("Thank You!");
        for (int i = 0; i < 1; i++) {
            System.out.println(name);
        }
    }
}

public class AV_73_thread_constructor {
    public static void main(String[] args) {
        MyThr t1 = new MyThr("Ankit");
        MyThr t2 = new MyThr("AV");

        t1.start();

        System.out.println("The id of the thread t is : " + t1.getId());
        System.out.println("The id of the thread t is : " + t1.getName());
        System.out.println("The id of the thread t is : " + t2.getId());
        System.out.println("The id of the thread t is : " + t2.getName());

        System.out.println("-----------------------------------");

        MyThr2 mt1 = new MyThr2("Ankit");
        MyThr2 mt2 = new MyThr2("AV");
        MyThr2 mt3 = new MyThr2("A_V");
        Thread gun1 = new Thread(mt1);
        Thread gun2 = new Thread(mt2);
        Thread gun3 = new Thread(mt3);
        gun1.start();
        gun2.start();
        gun3.start();

        System.out.println("Runnable thread id of gun1 : " + gun1.getId());
        System.out.println("Runnable thread name of gun1 : " + gun1.getName());
        System.out.println("Runnable thread id of gun2 : " + gun2.getId());
        System.out.println("Runnable thread name of gun2 : " + gun2.getName());
        System.out.println("Runnable thread id of gun3 : " + gun3.getId());
        System.out.println("Runnable thread name of gun3 : " + gun3.getName());

    }
}
