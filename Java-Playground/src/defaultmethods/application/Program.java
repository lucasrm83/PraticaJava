package defaultmethods.application;

import defaultmethods.services.InterestService;
import defaultmethods.services.UsaInterestService;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Amount: ");
        double amount = sc.nextDouble();
        System.out.println("Months: ");
        int months = sc.nextInt();

        InterestService is = new UsaInterestService(1.0);
        double payment = is.payment(amount,months);
        System.out.println("Payment after "+months+ " months: ");
        System.out.println(String.format("%.2f", payment));

        sc.close();
    }
}
