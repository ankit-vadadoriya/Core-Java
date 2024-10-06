class Employee1{
    int salary;
    String name;
    public int getSalary(){
        return salary;
    }

    public String getName() {
        return name;
    }
    public void setName(String n){
        name = n;
    }
}

class cellPhone{
    public void ring(){
        System.out.println("Ringing...");
    }
    public void vibrate(){
        System.out.println("Vibrating...");
    }
    public void callFriend(){
        System.out.println("Calling Ankit");
    }
}

class Squer{
    int side;
    public int are(){
        return side * side;
    }
    public int perimeter(){
        return 4 * side;
    }
}

class Rectangle{
    int length;
    int width;
    public int area(){
        return length * width;
    }
    public int perimeter(){
        return 2 * (length + width);
    }
}

class Tommy{
    public void hit(){
        System.out.println("Hitting the enemy");
    }
    public void run(){
        System.out.println("Runinng from the enemy");
    }
    public void fire(){
        System.out.println("Firing on the enemy");
    }
}

class Circle{
    float pi;
    float radius;
    public float area(){
        return pi * (radius * radius);
    }
    public float perimeter(){
        return 2 * pi * radius;
    }
}

public class AV_39_praticeSet {
    public static void main(String[] args) {
        /*
        //problem 1
        Employee1 av = new Employee1();
        av.setName("code with herry");
        System.out.println(av.getName());
        av.salary = 50000;
        System.out.println(av.getSalary());
//        int avSalary = av.getSalary();
//        System.out.println(avSalary);


        //problem 2
        cellPhone asus = new cellPhone();
        asus.callFriend();
        asus.vibrate();
        asus.ring();


        //problem 3
        Squer sq = new Squer();
        sq.side = 3;
        System.out.println("area : " + sq.are());
        System.out.println("perimeter : " + sq.perimeter());


        //problem 4
        Rectangle rt = new Rectangle();
        rt.length = 3;
        rt.width = 5;
        System.out.println("area : " + rt.area());
        System.out.println("perimeter : " + rt.perimeter())


        //problem 5
        Tommy player1 = new Tommy();
        player1.fire();
        player1.run();
        player1.hit();
        */


        //problem 6
        Circle cr = new Circle();
        cr.pi = 3.14f;
        cr.radius = 5;
        System.out.println("area : " + cr.area());
        System.out.println("perimeter : " + cr.perimeter());

    }
}
