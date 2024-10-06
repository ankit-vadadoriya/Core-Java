interface MyCamera{
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
interface MyWifi{
    String[] getNetworks();
    void connectToNetwork(String network);
    void wifi();
}

class MyCellPhone{
    void callNumber(int phoneNumber){
        System.out.println("Calling " + phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting...");
    }
}

class MySmartPhone extends MyCellPhone implements MyCamera, MyWifi{
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
}

public class AV_57_default_methods {
    public static void main(String[] args) {

        MyWifi mw = new MySmartPhone();  //can use only MyWifi methods
        mw.wifi();

        MySmartPhone ms = new MySmartPhone();  //can use MySmartPhone methods
        ms.recoed4kVideo();
//        ms.greet();  //throws an error because greet is private method
        String [] ar = ms.getNetworks();
        for (String item : ar){
            System.out.println(item);
        }
        ms.connectToNetwork("AV");
        ms.takeSnap();
        ms.recoedVideo();

    }
}
