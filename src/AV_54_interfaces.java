interface Bicycle{
    int ab = 45;
    void applyBrake(int decrement);
    void speedUp(int increment);
}
interface HornBicycle{
    int x = 11;
    void blowHornA();
    void blowHornB();
}

class AvonCycle implements Bicycle, HornBicycle{   //add all methods off class Bicycle
    int speed;
    int brake;
//    public int x = 12;
    void blowHorn(){
        System.out.println("Pee Pee Poo Poo");
    }
    public void applyBrake(int decrement){
        this.brake = decrement;
//        System.out.println("Applying brake : " + this.brake);
        for (int i=this.brake; i>=0; i--){
            System.out.println("Applying brake : " + i);
        }
        System.out.println("Bicycle STOP!!!");
    };
    public void speedUp(int increment){
        this.speed = increment;
        System.out.println("Applying speed : " + this.speed);
    };

    public void blowHornA(){
        System.out.println("a, b, c");
    }
    public void blowHornB(){
        System.out.println("1, 2, 3");
    }
}

public class AV_54_interfaces {
    public static void main(String[] args) {
        AvonCycle ac = new AvonCycle();
        ac.blowHorn();
        ac.applyBrake(5);
        ac.speedUp(1);

        //you can create property in Interfaces
        System.out.println(ac.ab);

        System.out.println(ac.x);

        //you can not modify the properties in Interfaces as they are final
//        ac.ab = 50;     //we not to change properties
//        System.out.println(ac.ab);

        ac.blowHornA();
        ac.blowHornB();
    }
}
