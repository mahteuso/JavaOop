package javaintermediario.DateCalendar.test;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest01 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();

        System.out.println(calendar.getCalendarType());
        System.out.println("---------------------------");
        System.out.println(date);
        System.out.println("Dia da semana: "+calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println("Dia da semana no mês: "+calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        System.out.println("Dia do mês: "+calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("Dia do ano: "+calendar.get(Calendar.DAY_OF_YEAR));

    }
}
