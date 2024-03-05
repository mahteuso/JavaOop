package javaintermediario.DateCalendar.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class DateWithLocale {
    public static void main(String[] args) {
        Locale localItalia = Locale.ITALIAN;
        Locale localEUA = Locale.ENGLISH;
        Locale localBrasil = Locale.JAPAN ;
        Calendar calendar = Calendar.getInstance();
        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, localEUA);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localItalia);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, localBrasil);

        System.out.println(df1.format(calendar.getTime()));
        System.out.println(df2.format(calendar.getTime()));
        System.out.println(df3.format(calendar.getTime()));
    }
}
