class Cylinder{
    int radius;
    int height;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double surfaceArea(){
        return (2 * Math.PI * radius * height) + (2 * Math.PI * radius * radius);
    }
    public double volume(){
        return Math.PI * (radius * radius) * height;
    }
    public Cylinder(){
        radius = 15;
        height = 30;
    }
    //----------OR----------
    public Cylinder(int radius, int height){
        this.radius = radius;
        this.height = height;
    }
}

class Rectangle1{
    private int length;
    private int breadth;

    public Rectangle1() {
        this.length = 4;
        this.breadth = 5;
    }

    public Rectangle1(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }
}

class Sphere{
    int radius;

    public Sphere(int radius) {
        this.radius = radius;
    }

    public double getArea() {
        return 4 * Math.PI * radius * radius;
    }
    public double getVolume() {
        return (4f/3f) * (Math.PI * radius * radius * radius);
    }
}

public class AV_44_practiceSet {
    public static void main(String[] args) {
        //problem 1
//        Cylinder myCylinder = new Cylinder();
//        myCylinder.setRadius(15);
//        System.out.println("Radius : " + myCylinder.getRadius());
//        myCylinder.setHeight(30);
//        System.out.println("Height : " + myCylinder.getHeight());

        //problem 2
//        System.out.println("SurfaceArea : " + myCylinder.surfaceArea());
//        System.out.println("Volume : " + myCylinder.volume());

        //problem 3
//        Cylinder myCylinder = new Cylinder();
        //-------OR-------
//        Cylinder myCylinder = new Cylinder(15,30);
//        System.out.println("Radius : " + myCylinder.getRadius());
//        System.out.println("Height : " + myCylinder.getHeight());

        //problem 4
//        Rectangle1 r = new Rectangle1(); //print length = 4 and breadth = 5
        //-------OR--------
//        Rectangle1 r = new Rectangle1(12,56);
//        System.out.println("Length : " + r.getLength());
//        System.out.println("Breadth : " + r.getBreadth());


        //problem 5
        Sphere s = new Sphere(2);
        System.out.println("Area of Sphere : " + s.getArea());
        System.out.println("Volume of Sphere : " + s.getVolume());



    }
}
