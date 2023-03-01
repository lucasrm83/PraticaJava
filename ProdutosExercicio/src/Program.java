import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        List<Product> list = new ArrayList<>();
        System.out.print("Enter number of products: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Product#"+i+ " data: ");
            System.out.print("common, used or imported (c/u/i)?");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Price: ");
            Double price = sc.nextDouble();
            if(ch =='c'){

                Product p = new Product(name,price);
                list.add(p);

            }
            if(ch =='u'){
                System.out.print("Manufactured date (dd/MM/yyyy): ");
                String data = sc.next();
                Product pu = new UsedProduct(name, price,sdf.parse(data));
                list.add(pu);


            }
            if(ch =='i'){
                System.out.print("Custom fee: ");
                Double customFee = sc.nextDouble();
                Product pi = new ImportedProduct(name,price,customFee);
                list.add(pi);



            }



        }
        for (Product product:list) {
            System.out.println(product.priceTag());

        }


    }
}