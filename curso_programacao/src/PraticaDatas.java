import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class PraticaDatas {
    public static void main(String[] args) {
        LocalDate  d01 = java.time.LocalDate.now();
        LocalDateTime d02 = java.time.LocalDateTime.now();
        Instant d03 = Instant.now();
        System.out.println(d01);
        System.out.println(d02);
        System.out.println(d03);

    }
}
