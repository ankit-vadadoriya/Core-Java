interface MyCamera2{
    void takeSnap();
    void recoedVideo();
    private void greet(){
        System.out.println("Good Morning");
    }
    default void recoed4kVideo(){
        greet();
        System.out.println("Recording in 4K...");
    };
}
interface MyWifi2{
    String[] getNetworks();
    void connectToNetwork(String network);
    void wifi();
}

class MyCellPhone2{
    void callNumber(String phoneNumber){
        System.out.println("Calling " + phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting...");
    }
}

class MySmartPhone2 extends MyCellPhone2 implements MyCamera2, MyWifi2{
    public void takeSnap(){
        System.out.println("Taking Snap!");
    }
    public void recoedVideo(){
        System.out.println("Record Video!");
    }
    //    public void recoed4kVideo(){
//        System.out.println("Taking 4k video in snap");
//    }
    public String[] getNetworks(){
        System.out.println("Getting List of Networks : ");
        String [] networkList = {"A-Plus", "Swaminarayan", "AV", "TP-Link"};
        return networkList;
    }
    public void connectToNetwork(String network){
        System.out.println("Connecting to " + network);
    };
    public void wifi(){
        System.out.println("My Wifi");
    }
    public void smapleMethod(){
        System.out.println("This is sample method");
    }
}

public class AV_59_polymorphism {
    public static void main(String[] args) {

        //can use only MyCamera2 methods
        MyCamera2 cam1 = new MySmartPhone2(); //this is smartphone but use it as a camera
        //cam1.getNetworks();  //not allowed
        //cam1.smapleMethod(); //not allowed
        cam1.recoed4kVideo();

        MySmartPhone2 s = new MySmartPhone2();
        System.out.println("--------------------------");
        s.smapleMethod();
        s.takeSnap();
        s.callNumber("+91 9157298221");

    }
}
