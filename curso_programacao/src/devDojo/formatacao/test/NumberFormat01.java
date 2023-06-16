package devDojo.formatacao.test;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormat01 {
    public static void main(String[] args) {
        NumberFormat[] nfa = new NumberFormat[4];
        Locale localeUS =Locale.US;
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;
        nfa[0] = NumberFormat.getInstance();
        nfa[1] = NumberFormat.getInstance(localeUS);
        nfa[2] = NumberFormat.getInstance(localeJP);
        nfa[3] = NumberFormat.getInstance(localeIT);
        double valor = 10_000.2130;
        for (NumberFormat numberFormat: nfa){
            System.out.println(numberFormat.format(valor));
        }

    }
}
