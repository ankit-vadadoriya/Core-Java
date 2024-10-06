public class AV_14_string_methods {
    public static void main(String[] args) {
        String name = "Ankit";
        System.out.println(name);
        int value = name.length();
        System.out.println("Length : " +value);

        String value1 = name.toLowerCase();
        System.out.println("To Lowercase : " + value1);

        String value2 = name.toUpperCase();
        System.out.println("To Uppercase : " + value2);

        String name3 = "   Vadadoriya   ";
        System.out.println("Surname : " + name3);
        String value3 = name3.trim();
        System.out.println("Trim : " + value3);

        System.out.println("substring : " + name.substring(3));
        System.out.println("substring : " + name.substring(2,4)); //start index is included and end index is excluded

        System.out.println("replace : " + name.replace('n','m'));
        System.out.println("replace : " + name.replace("nk","aabb"));
        String sname = "Vadadoriya";
        System.out.println("replace : " + sname.replace("a", "zz"));

        System.out.println("starts with : " + name.startsWith("an"));
        System.out.println("ends with : " + name.endsWith("it"));

        System.out.println("char at : " + name.charAt(2));

        System.out.println("index of : " + name.indexOf('i'));
        System.out.println("index of : " + name.indexOf("kit"));
        String modifyName = "Ankitkit";
        System.out.println("index of : " + modifyName.indexOf('i',1));
        System.out.println("index of : " + modifyName.indexOf('i',4));
        System.out.println("index of : " + modifyName.indexOf("tk",4));
        System.out.println("index of : " + modifyName.indexOf("itt",4));

        System.out.println("lastindex of : " + modifyName.lastIndexOf("kit"));
        System.out.println("lastindex of : " + modifyName.lastIndexOf("k",5)); //search in first 5 index
        System.out.println("lastindex of : " + modifyName.lastIndexOf("k",4));

        System.out.println("equals : " + name.equals("ankit"));
        System.out.println("equals : " + name.equals("Ankit"));

        System.out.println("equals ignorecase : " + name.equalsIgnoreCase("ankit"));
        System.out.println("equals ignorecase : " + name.equalsIgnoreCase("AnKIt"));
        System.out.println("equals ignorecase : " + name.equalsIgnoreCase("AnKItvadadoriya"));

        System.out.println("I am \bescape \t sequence \" \\ \' double \nquote");
        System.out.println("I am escape sequence \rdouble quote");
        System.out.println("I am escape sequence \fdouble quote");

    }
}
