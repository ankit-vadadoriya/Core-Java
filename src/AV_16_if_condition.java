public class AV_16_if_condition {
    public static void main(String[] args) {
        int age = 18;
        boolean a = (age==18);
        if(a){
            System.out.println("Yes, You can drive car");
        }
        else {
            System.out.println("No, You can not drive car");
        }

        System.out.println("For logical operator AND");
        boolean m = true;
        boolean n = true;
        boolean o = false;
        if(m && n && o){
            System.out.println("Y");
        }
        else {
            System.out.println("N");
        }

        System.out.println("For logical operator OR");
        boolean x = true;
        boolean y = false;
        if(x || y){
            System.out.println("Y");
        }
        else {
            System.out.println("N");
        }

        System.out.println("For logical operator NOT");
        System.out.print("Not(x) is ");
        System.out.println(!x);
        System.out.print("Not(y) is ");
        System.out.println(!y);
    }
}
