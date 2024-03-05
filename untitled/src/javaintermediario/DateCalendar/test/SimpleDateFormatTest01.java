package javaintermediario.DateCalendar.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest01 {
    public static void main(String[] args) {
        String pattern = "'Brazil' dd 'de' MMMM 'de' YYYY 'ás' HH:mm:ss z";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        System.out.println(sdf.format(new Date()));

        try{
            System.out.println(sdf.parse("Brazil 05 de março de 2024 ás 10:14:56 BRT"));
        }catch(ParseException e){
            e.printStackTrace();
        }
    }
}
