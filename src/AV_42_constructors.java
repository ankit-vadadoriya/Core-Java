class MyMainEmployee{
    private int id;
    private String name;
    private int salary;

    public MyMainEmployee(){
        id = 11;
        name = "Ankit_Vadadoriya";
        salary = 10000;
    }
    public MyMainEmployee(String myName, int myId, int mySalary){
        id = myId;
        name = myName;
        salary = mySalary;
    }
    public MyMainEmployee(String myName){
        id = 111;
        name = myName;
    }
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
    public int getSalary(){
        return salary;
    }
}

public class AV_42_constructors {
    public static void main(String[] args) {

        // MyMainEmployee av = new MyMainEmployee();
       MyMainEmployee av = new MyMainEmployee("Ankit", 15, 10000);
//        MyMainEmployee av = new MyMainEmployee("AV");

//        av.setId(11);
//        av.setName("Ankit");
        System.out.println("Id : " + av.getId());
        System.out.println("Name : " + av.getName());
        System.out.println("Salary : " + av.getSalary());
    }
}
