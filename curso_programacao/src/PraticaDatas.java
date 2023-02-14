import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PraticaDatas {
    public static void main(String[] args) {
        LocalDate d01 = java.time.LocalDate.now();
        LocalDateTime d02 = LocalDateTime.parse("2022-07-20"); //java.time.LocalDateTime.now();
        Instant d03 = Instant.now();
        System.out.println(d01);
        System.out.println(d02);
        DateTimeFormatter diaMesAno = null;
        System.out.println("D02 = " + d02.format(diaMesAno));
        diaMesAno = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    }
}
