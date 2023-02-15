import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PraticaDatas {
    public static void main(String[] args) {
        LocalDateTime d01 =LocalDateTime.parse("2022-07-20T01:30:26");
        LocalDate d02 = LocalDate.parse("2022-07-20"); //java.time.LocalDateTime.now();
        Instant d03 = Instant.parse("2022-07-20T01:30:26Z");

        //Mais e menos uma semana com datetime
        LocalDateTime = menosUmaSemanaDateTime = d01.minusDays(7);
        LocalDateTime maisUmaSemanaDateTime;
        LocalDateTime = maisUmaSemanaDateTime = d01.plusDays(7);

        //Mais e menos uma semana com local date
        LocalDate menosUmaSemanaDate = d02.minusDays(7);
        LocalDate maisUmaSemanaDate = d02.plusDays(7);
        System.out.println(d02);



        System.out.println(menosUmaSemanaDate);
        System.out.println(maisUmaSemanaDate);
        //Cada tipo de data tem suas próprias maneiras de serem manipuladoas
        //localdate time e instant por exemplo




    }
}
