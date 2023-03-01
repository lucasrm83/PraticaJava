import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.print("Enter number of products: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Product#"+i+1+ "data: ");
            System.out.println("common, used or imported (c/u/i)?");
            char ch = sc.next().charAt(0);
            if(ch =='c'){
                System.out.print("Name: ");
                String name = sc.next();
                System.out.print("Price: ");
                Double price = sc.nextDouble();
                Product p = new Product(name,price);

            }
            if(ch =='u'){
                System.out.print("Name: ");
                String name = sc.next();
                System.out.print("Price: ");
                Double price = sc.nextDouble();
                System.out.print("Manufactured date (dd/MM/yyyy): ");
                String data = sc.next();
                Product pu = new UsedProduct(name, price,sdf.parse(data));


            }
            if(ch =='i'){
                System.out.print("Name: ");
                String name = sc.next();
                System.out.print("Price: ");
                Double price = sc.nextDouble();
                System.out.print("Custom fee: ");
                Double customFee = sc.nextDouble();
                Product pi = new ImportedProduct(name,price,customFee);



            }



        }


    }
}