package devDojo.formatacao.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormat01 {
    public static void main(String[] args) {
        String pattern = "'Brasília' dd 'de' MMMM 'de' yyyy";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        System.out.println(sdf.format(new Date()));
        try {
            sdf.parse("Brasília 16 de junho de 2023");
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
