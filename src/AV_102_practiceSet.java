import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;

public class AV_102_practiceSet {
    public static void main(String[] args) {
        //problem 1
        System.out.println("----------Problem 1---------");
        ArrayList<String> s1 = new ArrayList<String>();
        s1.add("Student 1");
        s1.add("Student 2");
        s1.add("Student 3");
        s1.add("Student 4");
        s1.add("Student 5");
        s1.add(0,"Student 6");
        s1.add("Student 7");
        s1.add("Student 8");
        s1.add("Student 9");
        s1.add("Student 10");

//        for (int i=0; i < s1.size(); i++){
//            System.out.println(s1.get(i));
//        }
        //------------or------------
        for (String st : s1){
            System.out.println(st);
        }

        //problem 2
        System.out.println("----------Problem 2-----------");
        Date d = new Date();
        System.out.println(d.getHours() + ":" + d.getMinutes() + ":" + d.getSeconds());

        //problem 3
        System.out.println("---------Problem 3---------");
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.HOUR_OF_DAY) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));
        System.out.println(c.get(Calendar.HOUR) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));

        //program 4
        System.out.println("--------Problem 4--------");
        LocalDateTime lt = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("H:m:s");
        String result = lt.format(dtf);
        System.out.println(result);

        //program 5
        System.out.println("--------Problem 5--------");
        HashSet<Integer> s = new HashSet();
        s.add(5);
        s.add(6);
        s.add(46);
        s.add(60);
        s.add(9);
        s.add(6);
        System.out.println(s);

    }
}
