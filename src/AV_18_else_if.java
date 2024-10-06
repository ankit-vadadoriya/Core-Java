public class AV_18_else_if {
    public static void main(String[] args) {
        /*
        Scanner av = new Scanner(System.in);
        int age;
        System.out.print("Enter your age : ");
        age = av.nextInt();
        if(age>56){
            System.out.println("You are experienced!");
        }
        else if (age>46) {
            System.out.println("You are semi-experienced!");
        }
        else if (age>36) {
            System.out.println("You are semi-semi-experienced!");
        }
        else {
            System.out.println("You are not experienced!");
        }
         */

        char var = 'v';
        switch (var){
            case 'a' :
                System.out.println("This is character \'a\'");
                break;
            case 'v' :
                System.out.println("This is character \'v\'");
                break;
            case 'd' :
                System.out.println("This is character \'d\'");
                break;
            default :
                System.out.println("This is not a character \'a\'");
        }
    }
}
