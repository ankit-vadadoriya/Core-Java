class gm extends Thread{
    public void run(){
        int i = 1;
        while (i < 4){
            System.out.println("Good Morning!");
            i++;
        }
    }
}
class wc extends Thread{
    public void run(){
        int i = 1;
        while (i <= 2){
            try{
                Thread.sleep(200);
            }
            catch (Exception e){
                System.out.println(e);
            }
            System.out.println("Welcome!");
            i++;
        }
    }
}

public class AV_76_practiceSet {
    public static void main(String[] args) {
        gm g1 = new gm();
        wc w1 = new wc();
        g1.setPriority(6);
        w1.setPriority(9);
        System.out.println(g1.getPriority());
        System.out.println(w1.getPriority());

        g1.start();
        System.out.println(g1.getState());
        System.out.println(w1.getState());
        w1.start();

        //get reference
        System.out.println("current thread : " + Thread.currentThread().getState());
    }
}
