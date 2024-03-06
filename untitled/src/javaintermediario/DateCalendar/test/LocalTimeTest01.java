package javaintermediario.DateCalendar.test;

import java.time.LocalTime;

public class LocalTimeTest01 {
    public static void main(String[] args) {
        LocalTime hour = LocalTime.now();
        System.out.println(hour);
        System.out.println("--------------------");
        LocalTime newHour = LocalTime.of(23, 40, 55);
        System.out.println(newHour);
        System.out.println("--------------------");
        System.out.println(hour.getMinute());
    }
}
