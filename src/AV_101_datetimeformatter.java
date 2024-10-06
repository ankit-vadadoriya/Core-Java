import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class AV_101_datetimeformatter {
    public static void main(String[] args) {
        LocalDateTime lt = LocalDateTime.now();
        System.out.println(lt);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy||a");
        DateTimeFormatter df2 = DateTimeFormatter.ISO_LOCAL_DATE;   //using java documentation

        String myDate = lt.format(df);
        System.out.println(myDate);
    }
}
