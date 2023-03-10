package Trabalhador;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        // Necessário ao trabalhar com datas
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Department Name: ");
        String departmentName = sc.nextLine();
        System.out.println("Enter Worker data:");
        System.out.println("Name: ");
        String workerName = sc.nextLine();
        //Deve corresponder exatamente aos níveis contidos no enum, ignorecase ainda não testado para isso
        System.out.println("Level: ");
        String workerLevel = sc.nextLine();
        System.out.println("Base Salary: ");
        double baseSalary = sc.nextDouble();
        // O objeto Department esta compondo o objeto worker
        Worker worker = new Worker(workerName,WorkerLevel.valueOf(workerLevel),baseSalary,new Department(departmentName));

        System.out.println("How many contracts to this worker: ");
        int n = sc.nextInt();
        //O I começou com 1 pq a comparação é menor ou igual
        for (int i = 1; i <= n; i++) {
            System.out.println("Enter contract #"+i+" data: ");
            System.out.println("Date (DD/MM/YYYY): ");
            // O simpledateformat está formatando o date
            Date contractDate = sdf.parse(sc.next());
            System.out.println("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            System.out.println("Duration (hours): ");
            int hours = sc.nextInt();
            // Instanciando um novo contrato
            HourContract contract = new HourContract(contractDate,valuePerHour,hours);
            //Adicionando o contrato a lista, associando com esse trabalhador
            worker.addContract(contract);




        }
        System.out.println();
        System.out.println("Enter a month and year to calculate income (MM/YYYY): ");
        String monthAndYear = sc.next();
        //Vai recortar entre o 0 e o 2
        int month = Integer.parseInt(monthAndYear.substring(0,2));
        //vai recortar do 3 em diante
        int year = Integer.parseInt(monthAndYear.substring(3));
        System.out.println("Name: "+worker.getName());
        System.out.println("Department: "+ worker.getDepartment().getName());
        System.out.println("Income for "+monthAndYear+ ": "+ String.format("%.2f",worker.income(year,month)));
        //Sugestão: Adicionar listar todos os contratos por nome do trabalhador
        //System.out.println("Worker name to be searched: ");










        sc.close();

    }
}
