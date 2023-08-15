package interfaces.parking;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        DateTimeFormatter fmt =DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm:ss");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rental data: ");
        System.out.print("Car Model: ");
        String model = sc.nextLine();
        System.out.print("Pickup: (dd/MM/yyyy hh:mm:ss): ");
        LocalDateTime pickup = LocalDateTime.parse(sc.nextLine(),fmt);
        System.out.print("Return (dd/MM/yyyy hh:mm:ss): ");
        LocalDateTime carReturn = LocalDateTime.parse(sc.nextLine(),fmt);
        System.out.println("Enter price per hour: ");
        Double hour = sc.nextDouble();
        System.out.println("Enter price per day: ");
        Double day = sc.nextDouble();

        Parking parking = new Parking(model,pickup,carReturn,hour,day);
        System.out.println(parking);

    }
}
