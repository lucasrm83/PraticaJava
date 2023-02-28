package polimorfismo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numbers of Employee:? ");
        int n = sc.nextInt();
        for (int i = 0; i <n ; i++) {

            System.out.println("Employee #"+i+"data: ");
            System.out.print("Outsourced (y/n)?");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            System.out.print("Value per hour: ");
            double valueperhour = sc.nextDouble();

            if (ch =='y'){
                System.out.println("Adicional charge: ");
                double adicionalcharge = sc.nextDouble();
                Employee emp = new OutsourcedEmployee(name, hours,valueperhour,adicionalcharge);
                list.add(emp);

            }
            else{
                Employee emp = new Employee(name,hours,valueperhour);
                list.add(emp);
            }






        }
        System.out.println("Payments: ");
        for (Employee emp:list) {
            System.out.println(emp.getName()+" - $ "+String.format("%.2f",emp.payment()));

        }
        sc.close();

    }
}
