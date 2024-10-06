class Employee{
    int id;  //attributes
    int salary;  //attributes
    String name;  //attributes
    String qualification;  //attributes
    public void printDetails(){
        System.out.println("My id is " + id);
        System.out.println("My name is " + name);
    }

    public int getSalary(){
        return salary;
    }
    public String getQualification(){
        return qualification;
    }
}

public class AV_38_custom_class {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee av = new Employee(); //Instantiating a new employee object
        Employee va = new Employee();

        //set attributes for av
        av.id = 1;
        av.salary = 35000;
        av.name = "Ankit";
        av.qualification = "BCA";

        //set attributes for va
        va.id = 16;
        va.salary = 45000;
        va.name = "AV";
        va.qualification = "B.Com";

        //printing the attributes
        av.printDetails();
        va.printDetails();

        int avSalary = av.getSalary();
        System.out.println(avSalary);

        int vaSalary = va.getSalary();
        System.out.println(vaSalary);

        String avQualification = av.getQualification();
        System.out.println(avQualification);

        String vaQualification = va.getQualification();
        System.out.println(vaQualification);

//        System.out.println(av.id);
//        System.out.println(av.name);
    }
}
