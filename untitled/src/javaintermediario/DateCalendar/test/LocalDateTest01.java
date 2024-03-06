package javaintermediario.DateCalendar.test;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateTest01 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2024, Month.MARCH, 5);
        LocalDate now = LocalDate.now();
        System.out.println("---------------------");
        System.out.println(date.getDayOfYear());

        System.out.println("---------------------");
        System.out.println(date.getDayOfMonth());
        System.out.println("---------------------");
        System.out.println(date.getMonth());
        System.out.println("---------------------");
        System.out.println(date.getYear());
        System.out.println("---------------------");
        System.out.println(date.getMonthValue());
        System.out.println("---------------------");
        System.out.println(date);
        System.out.println("---------------------");
        System.out.println(now);
    }
}
