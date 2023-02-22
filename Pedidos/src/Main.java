import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Client Data: ");
        System.out.print("Name: ");
        String clientName = sc.next();
        System.out.print("Email: ");
        String clientEmail = sc.next();
        System.out.println("Birth Date dd/mm/yyyy: ");
        String clientBirth = sc.next();

        System.out.println("Enter Order Data: ");
        String clientStatus = sc.next();
        System.out.println("How many items to this order: ");
        int n = sc.nextInt();
        sc.next();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter #"+i+ " item data: ");
            System.out.println("Product name: ");
            String productName =sc.next();
            System.out.println("Product price: ");
            Double productPrice =sc.nextDouble();
            System.out.println("Quantity: ");
            Integer producQuantity = sc.nextInt();


        }




    }
}