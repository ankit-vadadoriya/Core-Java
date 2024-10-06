import java.util.Scanner;

class Message{
    String result;
    public Message(String a){
        this.result = a;
        System.out.println("Show Message!");
        System.out.println(result);
    }
}

public class AV_67_practiceSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write a message...");
        String m = sc.nextLine();
        Message ms = new Message(m);
    }
}
