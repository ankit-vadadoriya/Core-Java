import java.util.Scanner;

public class AV_19_practiceSet {
    public static void main(String[] args) {
//        int a = 10;
//        if(a==11){
//            System.out.println("I am 11");
//        }
//        else {
//            System.out.println("I am not 11");
//        }


//        int m1, m2, m3;
//        Scanner av = new Scanner(System.in);
//        System.out.print("Enter 1st Subject marks : ");
//        m1 = av.nextInt();
//        System.out.print("Enter 2nd Subject marks : ");
//        m2 = av.nextInt();
//        System.out.print("Enter 3rd Subject marks : ");
//        m3 = av.nextInt();
//        float avg = (m1+m2+m3)/3.0f;
//        System.out.println("Percentage is : " + avg);
//        if(avg>=40 && m1>=33 && m2>=33 && m3>=33){
//            System.out.println("You are pass!");
//        }
//        else {
//            System.out.println("You are fail");
//        }

        // calculate tax

//        Scanner av = new Scanner(System.in);
//        System.out.print("Enter your Income : ");
//        int income = av.nextInt();
//        float tax = 0;
//        if(income<=250000){
//            tax = tax + 0;
//        }
//        else if(income>250000 && income<=500000){
//            tax = tax + 5 * (income-250000)/100;
//        }
//        else if(income>500000 && income<=1000000){
//            tax = tax + 5 * (500000-250000)/100;
//            tax = tax + 20 * (income-500000)/100;
//        }
//        else{
//            tax = tax + 5 * (500000-250000)/100;
//            tax = tax + 20 * (1000000-500000)/100;
//            tax = tax + 30 * (income-1000000)/100;
//        }
//        System.out.println("Total tax paid by employee is : " + tax);

        // days

//        Scanner av = new Scanner(System.in);
//        System.out.print("Enter Number : ");
//        int day = av.nextInt();
//        switch (day){
//            case 1 :
//                System.out.println("Monday");
//                break;
//            case 2 :
//                System.out.println("Tuesday");
//                break;
//            case 3 :
//                System.out.println("Wednesday");
//                break;
//            case 4 :
//                System.out.println("Thursday");
//                break;
//            case 5 :
//                System.out.println("Friday");
//                break;
//            case 6 :
//                System.out.println("Saturday");
//                break;
//            case 7 :
//                System.out.println("Sunday");
//                break;
//            default :
//                System.out.println("Please enter valid number");
//        }

        // leap year or not

//        Scanner av = new Scanner(System.in);
//        System.out.print("Enter Year : ");
//        int year = av.nextInt();
//        if(year%2==0){
//            System.out.println(year + " is a leap year");
//        }
//        else {
//            System.out.println(year + " is not a leap year");
//        }

        // find website is .com, .org or .in

        Scanner av = new Scanner(System.in);
        System.out.print("Enter website : ");
        String website = av.nextLine();
        if(website.endsWith(".com")){
            System.out.println("This is \'Commercial Website\'");
        }
        else if(website.endsWith(".org")){
            System.out.println("This is \'Organization Website\'");
        }
        else if(website.endsWith(".in")){
            System.out.println("This is \'Indian Website\'");
        }
        else {
            System.out.println("This is other website");
        }

    }
}
