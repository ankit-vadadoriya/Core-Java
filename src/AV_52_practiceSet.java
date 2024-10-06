class Circle0{
    public int radius;
    Circle0(){
        System.out.println("I am a not parameterized constructor");
    }
    Circle0(int r){
//        System.out.println("I am circle parameterized constructor");
        this.radius = r;
    }
    public double area(){
        return Math.PI * this.radius * this.radius;
    }
}

class Cylinder1 extends Circle0{
    public int height;
    Cylinder1(int r, int h){
        super(r);
//        System.out.println("I am cylinder1 parameterized constructor");
        this.height = h;
    }
    public double volume(){
        return Math.PI * this.radius * this.radius * this.height;
    }
}

//-----------------------------------------------------

class Rectangle11{
    public int length;
    public int width;
    public int height;
//    Rectangle11(int l, int w){
//        this.length = l;
//        this.width = w;
//    }
    public int getRectangleArea(){
        return length * width;
    }
    public void setRectangleArea(int l, int w){
        this.length = l;
        this.width = w;
    }
    public int getRectangleVolume(){
        return length * width * height;
    }
    public void setRectangleVolume(int l, int w, int h){
        this.length = l;
        this.width = w;
        this.height = h;
    }
}

class Cuboid11 extends Rectangle11{
    public int height;
//    Cuboid11(int l, int w, int h){
//        super(l, w);
//        this.height = h;
//    }
    public int getCuboidVolume(){
        return length * width * height;
    }
    public void setCuboidVolume(int l, int w, int h){
        this.length = l;
        this.width = w;
        this.height = h;
    }
    public int getCuboidArea(){
        return 2 * ((length * height) + (length * width) + (height * width));
    }
    public void setCuboidArea(int l, int w, int h){
        this.length = l;
        this.width = w;
        this.height = h;
    }
}

class Base11{
    Base11(){
        System.out.println("I am a constructor of Base11");
    }
}
class Derived11 extends Base11{
    Derived11(){
        System.out.println("I am a constructor of Derived11");
    }
}
class DerivedChild11 extends Derived11{
    DerivedChild11(){
        System.out.println("I am a constructor of DerivedChild11");
    }
}

public class AV_52_practiceSet {
    public static void main(String[] args) {
        //problem 1
        Circle0 obj1 = new Circle0(12);
        System.out.println("Circle Area : " + obj1.area());
        Cylinder1 obj = new Cylinder1(12, 4);
        System.out.println("Cylinder  Volume : " + obj.volume());

        //problem 2
////        Rectangle11 r11 = new Rectangle11(6, 8); //while use constructor
//        Rectangle11 r11 = new Rectangle11();
//
//        r11.setRectangleArea(7,8);
//        System.out.println("Rectangle Area : " + r11.getRectangleArea());
//
//        r11.setRectangleVolume(7,8,9);
//        System.out.println("Rectangle Volume : " + r11.getRectangleVolume());
//
////        Cuboid11 cb = new Cuboid11(5, 7, 10); //while use constructor
//        Cuboid11 cb = new Cuboid11();
//
//        cb.setCuboidVolume(2, 5, 7);
//        System.out.println("Cuboid Volume : " + cb.getCuboidVolume());
//
//        cb.setCuboidArea(2, 5, 7);
//        System.out.println("Cuboid Area : " + cb.getCuboidArea());


        //problem 5
//        DerivedChild11 dc = new DerivedChild11();


    }
}
