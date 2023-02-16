import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class DatasExercicio {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat  data1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat data2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        SimpleDateFormat data3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        data3.setTimeZone(TimeZone.getTimeZone("GMT"));
        //Ambos pra pegar o tempo atual
        Date x1 = new Date();
        Date x2 = new Date(System.currentTimeMillis());
        Date y1 = data1.parse("26/04/2016");
        Date y2 = data2.parse("26/04/2016 08:40:27");
        Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

        System.out.println("Data 1: "+data1.format(y1));
        System.out.println("Data 2: "+data2.format(y2));
        System.out.println("Data Atual: "+data2.format(x1));
        System.out.println("Y3: "+data3.format(y3));

    }
}
