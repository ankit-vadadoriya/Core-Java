public class AV_80_try_catch {
    public static void main(String[] args) {
        int a = 6000;
        int b = 0;

        //without try
//        int c = a/b;
//        System.out.println("The result is : " + c);

        //with try :
        try{
            int c = a/b;
            System.out.println("The result is : " + c);
        }
        catch (Exception e){
            System.out.println("We failed to divied. Reason : " + e);
        }

        System.out.println("End the program");

    }
}
