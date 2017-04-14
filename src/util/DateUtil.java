package util;

/**
 *
 * @author Aimad.JAOUHAR
 */
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {

    public static java.sql.Date getSqlDate(java.util.Date date) {
        return new java.sql.Date(date.getTime());
    }

    public static Calendar dateToCalendar(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar;
    }

    public static Date calendarToDate(Calendar calendar) {
        return calendar.getTime();
    }

    public static String strDateDefaultPattern(Date date) {
        return formateDate(date, "dd/MM/yyyy");
    }

    public static String formateDate(Date date, String pattern) {
        DateFormat df = new SimpleDateFormat(pattern);
        return df.format(date);
    }

    public static Date stringToDate(String strDate, String pattern) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        try {
            return simpleDateFormat.parse(strDate);
        } catch (ParseException e) {
        }
        return null;
    }
}
