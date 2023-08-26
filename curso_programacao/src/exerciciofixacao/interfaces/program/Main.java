package exerciciofixacao.interfaces.program;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter contract data: ");
        System.out.print("Number: ");
        int number = sc.nextInt();
        System.out.print("Data (dd/MM/yyyy): ");
        LocalDateTime data = LocalDateTime.parse(sc.nextLine(),dtf);
        System.out.print("Contract value: ");
        double value = sc.nextDouble();
        System.out.print("Enter the number of installment: ");
        int installments = sc.nextInt();
        System.out.println("Installments: ");




    }
}
