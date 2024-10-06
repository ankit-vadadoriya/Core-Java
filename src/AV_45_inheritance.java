class Base{
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I am in base and setting x now");
        this.x = x;
    }

    public void printMe(){
        System.out.println("I am a Constructor");
    }
}

class Derived extends Base{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

public class AV_45_inheritance {
    public static void main(String[] args) {
        //creating an object of base class
        Base b = new Base();
        b.setX(5);
        System.out.println("b : " + b.getX());


        //creating an object of derived class
        Derived d = new Derived();
        d.setX(10);    //object of derived class and call base class method
        System.out.println("x : " + d.getX());
        d.setY(20);
        System.out.println("y : " + d.getY());

        b.setX(100);
        System.out.println("x : " + b.getX());
    }
}
