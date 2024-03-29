package devDojo.formatacao.test;

import java.text.NumberFormat;
import java.text.ParseException;
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
        double valor = 1_000.2130;
        for (NumberFormat numberFormat: nfa){
            numberFormat.setMaximumFractionDigits(2);
            System.out.println(numberFormat.getMaximumFractionDigits());
            System.out.println(numberFormat.format(valor));
        }
        String valorString = "1000.2130";
        try {
            System.out.println(nfa[0].parse(valorString));
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
