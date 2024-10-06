import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class AV_99_gregorian_calendar {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c.getTime());
        System.out.println(c.get(Calendar.DATE));
        System.out.println(c.get(Calendar.MONTH));
        System.out.println(c.get(Calendar.YEAR));
        System.out.print(c.get(Calendar.HOUR) + ":");
        System.out.print(c.get(Calendar.MINUTE) + ":");
        System.out.println(c.get(Calendar.SECOND));
        System.out.println(c.get(Calendar.DAY_OF_WEEK));
        System.out.println(c.get(Calendar.HOUR_OF_DAY) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));  //24 hours format
        System.out.println("---------------------------");

        GregorianCalendar cal = new GregorianCalendar();
        System.out.println(cal.isLeapYear(2023));
        System.out.println(cal.isLeapYear(2024));

        System.out.println();
        System.out.println(TimeZone.getAvailableIDs()[0]);
        System.out.println(TimeZone.getAvailableIDs()[1]);
        System.out.println(TimeZone.getAvailableIDs()[2]);
        System.out.println(TimeZone.getAvailableIDs()[3]);
        System.out.println(TimeZone.getAvailableIDs()[4]);
        System.out.println("---------------");
        System.out.println(TimeZone.getDefault());

    }
}
