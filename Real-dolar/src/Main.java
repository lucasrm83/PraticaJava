import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the dollar price: ");
        double d = sc.nextDouble();
        System.out.println("How many dollar will be bought?: ");
        double b = sc.nextDouble();
        System.out.printf("Amout to be paid in Reais = %.2f%n ", CurrencyConverter.converter(d,b));
        sc.close();

    }
}