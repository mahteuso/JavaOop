package javaintermediario.DateCalendar.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();

        LocalDate date = LocalDate.parse("2022-03-25");
        LocalTime time = LocalTime.parse("22:48:05");

        LocalDateTime novo = date.atTime(time);
        System.out.println(dateTime);
        System.out.println("--------------------");
        LocalDateTime newDateTime = LocalDateTime.of(2024, Month.MARCH, 5, 12,45);
        System.out.println(newDateTime);
        System.out.println("--------------------");
        System.out.println(newDateTime.getDayOfWeek());
        System.out.println("--------------------");
        System.out.println(date);
        System.out.println("--------------------");
        System.out.println(time);
        System.out.println("--------------------");
        System.out.println(novo);
    }
}
