public class AV_15_string_practiceSet {
    public static void main(String[] args) {
        String name1 = "AnKiT";
        name1 = name1.toLowerCase();
        System.out.println("ToLowerCase : " + name1);

        String name2 = "My name is   ankit vadadoriya";
        name2 = name2.replace(" ","_");
        System.out.println(name2);

//        Scanner av = new Scanner(System.in);
//        String name = av.nextLine();
//        System.out.println("Dear |" + name + "|, Thanks a lot");
//        System.out.println("-----------OR-----------");
        String letter1 = "Dear <|name|>, Thanks a lot";
        letter1 = letter1.replace("<|name|>", "Ankit");
        System.out.println(letter1);

        String myString = "This string contains  double and tripal spaces";
        System.out.println("Double Spaces : " + myString.indexOf("  "));
        System.out.println("Tripal Spaces : " + myString.indexOf("   "));

        String letter2 = "Dear Ankit, \n\tThis java course is nice. \nThanks!";
        System.out.println(letter2);

    }
}
