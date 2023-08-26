package exerciciofixacao.interfaces.program;

import exerciciofixacao.interfaces.entities.Contract;
import exerciciofixacao.interfaces.entities.Installment;
import exerciciofixacao.interfaces.service.ContractService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        Scanner sc = new Scanner(System.in);
        ContractService contractService = new ContractService();


        System.out.println("Enter contract data: ");
        System.out.print("Number: ");
        int number = sc.nextInt();
        sc.nextLine();
        System.out.print("Data (dd/MM/yyyy): ");
        LocalDateTime data = LocalDateTime.parse(sc.nextLine(),dtf);
        System.out.print("Contract value: ");
        double value = sc.nextDouble();

        Contract contract = new Contract(number,data,value);
        System.out.print("Enter the number of installment: ");
        int installments = sc.nextInt();
        System.out.println("Installments: ");
        contractService.processContract(contract,installments);
        sc.close();

        for (Installment i:contract.getInstallments()) {
            System.out.println(i.getDueDate()+" - "+i.getAmount());

        }






    }
}
