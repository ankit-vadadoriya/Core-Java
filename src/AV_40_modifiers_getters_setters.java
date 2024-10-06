class MyEmployee{
    private int id;
    private String name;
    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }
    public void setId(int i){
        id = i;
    }
    public int getId(){
        return id;
    }
}

class Circle1{
    private float pi;
    private float radius;
    public void setArea(float p, float r){
        pi = p;
        radius = r;
    }
    public float getArea(){
        return pi * (radius * radius);
    }
    public void setPerimeter(float p, float r){
        pi = p;
        radius = r;
    }
    public float getPerimeter(){
        return 2 * pi * radius;
    }
}

public class AV_40_modifiers_getters_setters {
    public static void main(String[] args) {
        MyEmployee ankit = new MyEmployee();
        //ankit.id = 45;
        //ankit.name = "code with ankit";  // error due to private access modifier
        ankit.setName("code with ankit");
        System.out.println(ankit.getName());
        ankit.setId(11);
        System.out.println(ankit.getId());


        Circle1 cr = new Circle1();
        cr.setArea(3.14f, 3);
        System.out.println("area : " + cr.getArea());
        cr.setPerimeter(3.14f, 3);
        System.out.println("perimeter : " + cr.getPerimeter());

    }
}
