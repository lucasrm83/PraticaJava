import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Client Data: ");
        System.out.print("Name: ");
        String clientName = sc.nextLine();
        System.out.print("Email: ");
        String clientEmail = sc.nextLine();
        System.out.println("Birth Date dd/mm/yyyy: ");
        Date clientBirth = sdf.parse(sc.next());
        //Objetos independentes devem ser instanciados primeiro
        Client client = new Client(clientName,clientEmail,clientBirth);



        System.out.println("Enter Order Data: ");
        System.out.println("Status: ");
        //Enums devem ser digitados da exata maneira como específicado na classe
        OrderStatus clientStatus = OrderStatus.valueOf(sc.next());
        //O objeto order é instanciado antes do for porque não é necessário fazer para cada loop
        Order order = new Order(new Date(),clientStatus,client);
        System.out.println("How many items to this order: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter #"+i+ " item data: ");
            sc.nextLine();
            System.out.println("Product name: ");
            String productName =sc.nextLine();
            System.out.println("Product price: ");
            Double productPrice =sc.nextDouble();
            System.out.println("Quantity: ");
            Integer productQuantity = sc.nextInt();
            Product product = new Product(productName, productPrice);
            OrderItem it = new OrderItem(productQuantity,productPrice,product);
            order.addItem(it);


        }
        System.out.println(order);
        // Falta a parte de retorno do sistema





    }
}