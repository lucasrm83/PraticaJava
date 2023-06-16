package devDojo.formatacao.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormat02 {
    public static void main(String[] args) {
        NumberFormat[] nfa = new NumberFormat[4];
        Locale localeUS =Locale.US;
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;
        nfa[0] = NumberFormat.getCurrencyInstance();
        nfa[1] = NumberFormat.getCurrencyInstance(localeUS);
        nfa[2] = NumberFormat.getCurrencyInstance(localeJP);
        nfa[3] = NumberFormat.getCurrencyInstance(localeIT);
        double valor = 10_000.2130;
        for (NumberFormat numberFormat: nfa){
            System.out.println(numberFormat.getMaximumFractionDigits());
            System.out.println(numberFormat.format(valor));

        }
        String valorString = "￥10,000";
        try {
            System.out.println(nfa[2].parse(valorString));
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
