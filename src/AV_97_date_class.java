import java.util.Date;

public class AV_97_date_class {
    public static void main(String[] args) {
//        System.out.println(Integer.MIN_VALUE);
//        System.out.println(Integer.MAX_VALUE);
//        System.out.println(Long.MAX_VALUE);
//        System.out.println(System.currentTimeMillis());

        //Date and Time
        Date d = new Date();
        System.out.println(d);

        System.out.println("Time : " + d.getTime());
        System.out.println("Date : " + d.getDate());
        System.out.println("Month : " + d.getMonth());
        System.out.println("Year : " + d.getYear() + 1900);
        System.out.println("Hour : " + d.getHours());
        System.out.println("Minute : " + d.getMinutes());
        System.out.println("Second: " + d.getSeconds());
    }
}
