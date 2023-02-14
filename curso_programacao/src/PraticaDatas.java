import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PraticaDatas {
    public static void main(String[] args) {
        LocalDate d01 = java.time.LocalDate.now();
        LocalDate d02 = LocalDate.parse("2022-07-20"); //java.time.LocalDateTime.now();
        Instant d03 = Instant.now();

        //Menos um dia
        LocalDate menosUmaSemana = d02.minusDays(1);
        System.out.println(d02);
        System.out.println(menosUmaSemana);
        //Cada tipo de data tem suas próprias maneiras de serem manipuladoas
        //localdate time e instant por exemplo




    }
}
