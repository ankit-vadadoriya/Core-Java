import java.time.Year;
import java.util.Calendar;
import java.util.Date;

public class AV_96_date {
    public static void main(String[] args) {
        System.out.print("Milli-seconds after 1970 : ");
        System.out.println(System.currentTimeMillis());
        System.out.print("Seconds after 1970 : ");
        System.out.println(System.currentTimeMillis()/1000);
        System.out.print("Hours after 1970 : ");
        System.out.println(System.currentTimeMillis()/1000/3600);
        System.out.print("Days after 1970 : ");
        System.out.println(System.currentTimeMillis()/1000/3600/24);
        System.out.print("Years after 1970 : ");
        System.out.println(System.currentTimeMillis()/1000/3600/24/365);

        System.out.println("----------------------");

        Date d = new Date();
        System.out.println(d);
        System.out.println(d.getTime());
        System.out.println("Date : " + d.getDate());
        System.out.println("Month : " + d.getMonth());
        System.out.println("Year : " + (d.getYear() + 1900));

        int year = Year.now().getValue();
        System.out.println(year);
        //--------------OR-----------------
        Year year1 = Year.now();
        System.out.println(year1);


        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2005);
        calendar.set(Calendar.MONTH, Calendar.FEBRUARY);
        calendar.set(Calendar.DAY_OF_MONTH, 16);
        System.out.println(calendar.getTime());
    }
}
