import java.util.Calendar;
import java.util.TimeZone;

public class AV_98_calendar_class {
    public static void main(String[] args) {
//        Calendar c1 = Calendar.getInstance();
//        System.out.println(c1.getCalendarType());
//        System.out.println(c1.getTimeZone());

        Calendar c = Calendar.getInstance();
        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone().getID());

        System.out.println(c.getTime());
    }
}
