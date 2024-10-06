class Phone{
    public void ShowTime(){
        System.out.println("Time is 8 AM");
    }
    public void on(){
        System.out.println("Turning on Phone...");
    }
}

class SmartPhone extends Phone{
    public void Music(){
        System.out.println("Playing Music...");
    }
    public void on(){
        System.out.println("Turning on SmartPhone...");
    }
}

public class AV_49_dynamic_method_dispatch {
    public static void main(String[] args) {
//        Phone obj = new Phone();
//        SmartPhone smobi = new SmartPhone();
//        obj.name();


        Phone obj = new SmartPhone(); //only methods call which include in super class(Phone)
//        SmartPhone obj - new Phone();  //not allowed
        obj.ShowTime();
        obj.on();
//        obj.Music(); //not called

    }
}
