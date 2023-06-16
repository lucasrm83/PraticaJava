package devDojo.formatacao.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest02 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        String[] countries = Locale.getISOCountries();
        String[] languages = Locale.getISOLanguages();
        for (String s: countries) {
            System.out.print(s+" ");
            
        }
        System.out.println();
        for (String language: languages) {
            System.out.print(language+" ");

        }
        System.out.println();
    }
}
