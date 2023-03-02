import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Person> list = new ArrayList<>();
        System.out.print("Enter number of tax payers: ");
        int n = sc.nextInt();
        for (int i = 1; i <=n ; i++) {
            System.out.println("Tax payer data: ");
            System.out.print("Individual or company (i/c)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Annual income: ");
            double income = sc.nextDouble();
            if(ch =='i'){
                System.out.print("Health expenditures: ");
                double health = sc.nextDouble();
                list.add(new Individual(name,income,health));


            }
            if(ch =='c'){
                System.out.print("Number of employee: ");
                int employee = sc.nextInt();
                list.add(new Company(name,income,employee));

            }


        }
        System.out.println("Taxes paid: ");
        double sum =0;
        for (Person p:list) {
            System.out.println(p.getName()+" $ "+String.format("%.2f",p.juros()) );
            sum+=p.juros();


        }
        System.out.println(String.format("TOTAL TAXES: %.2f",sum));


    }
}