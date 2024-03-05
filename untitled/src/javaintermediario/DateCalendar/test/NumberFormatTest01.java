package javaintermediario.DateCalendar.test;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest01 {
    public static void main(String[] args) {
        // A classe NumberFotmat é abstrata

        Locale localBr = new Locale("pt", "BR");
        Locale localEng = Locale.UK;
        Locale localGer = Locale.GERMANY;
        Locale localChi = Locale.CHINA;

        NumberFormat[] nfa = new NumberFormat[5];
        nfa[0] = NumberFormat.getInstance();
        nfa[1] = NumberFormat.getInstance(localBr);
        nfa[2] = NumberFormat.getInstance(localEng);
        nfa[3] = NumberFormat.getInstance(localGer);
        nfa[4] = NumberFormat.getInstance(localChi);

        double valor = 10_000.765;

        for (NumberFormat number : nfa){
            System.out.println(number.format(valor));
        }


    }
}
