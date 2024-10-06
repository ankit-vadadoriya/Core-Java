abstract class Pen{
    abstract void write();
    abstract void refill();
}
class FountainPen extends Pen{
    public void write(){
        System.out.println("Write with pen");
    }
    public void refill(){
        System.out.println("Add new refill in pen");
    }
    public void changeRefill(){
        System.out.println("Change the refill");
    }
}
//========================Problem 3======================================
class Monkey{
    public void jump(){
        System.out.println("Monkey was jumping...");
    }
    public void bite(){
        System.out.println("Monkey was biting...");
    }
}
interface BasicAnimal{
    void eat();
    void sleep();
}
class Human extends Monkey implements BasicAnimal{
    public void speak(){
        System.out.println("Monkey was speaking");
    }
    public void eat(){
        System.out.println("Animals eat grass");
    }
    public void sleep(){
        System.out.println("Animals was sleep");
    }
}
//========================Problem 4======================================
 abstract class TelePhone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}
class SmartPhone1 extends TelePhone{
    public void connect(){
        System.out.println("Phone connected");
    }
    public void ring(){
        System.out.println("Ringing...");
    }
    public void lift(){
        System.out.println("Call left");
    }
    public void disconnect(){
        System.out.println("Call disconnected");
    }
}
//========================Problem 6======================================
interface TvRemote {
    void turnOn();
    void turnOff();

}
interface SmartTvRemote extends TvRemote {
    void volumeUp();
    void volumeDown();
}
class Tv implements TvRemote, SmartTvRemote{
    public void turnOn(){
        System.out.println("Turn on TV");
    }
    public void turnOff(){
        System.out.println("Turn off TV");
    }
    public void volumeUp(){
        System.out.println("Volume Up");
    }
    public void volumeDown(){
        System.out.println("Volume Down");
    }
}


public class AV_60_practiceSet {
    public static void main(String[] args) {

        //problem 1
//        FountainPen r = new FountainPen();
//        r.write();
//        r.refill();
//        r.changeRefill();

        //Problem 3
//        Human h = new Human();
//        h.eat();
//        h.sleep();
//        h.speak();
//        h.jump();
//        h.bite();

        //Problem 4
//        TelePhone t = new SmartPhone1();
//        t.ring();
//        t.disconnect();
//        //t.connect();  //get error because polymorphism can use only TelePhone methods
//        SmartPhone1 sp = new SmartPhone1();
//        sp.connect();

        //Problem 5
//        Monkey m = new Human();  //polymorphism, can use only Monkey methods
//        m.speak();  //get error  // cannot use speak method because the reference is monkey which done not have speak method
//        m.eat();    //get error
//        m.jump();
//        BasicAnimal b = new Human();
//        b.eat();
//        //b.speak();  //get error

        //Problem 6 & 7
        Tv tv = new Tv();
        tv.turnOn();
        tv.turnOff();
        tv.volumeUp();
        tv.volumeDown();
    }
}
