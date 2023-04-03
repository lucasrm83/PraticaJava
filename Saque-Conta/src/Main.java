import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter acount Data ");
            System.out.print("Number: ");
            int number = sc.nextInt();
            sc.nextLine();
            System.out.print("Holder: ");
            String holder = sc.nextLine();
            System.out.print("Initial Balance: ");
            double balance = sc.nextDouble();
            System.out.print("Withdraw limit: ");
            double withdrawLimit = sc.nextDouble();
            Account account = new Account(number,holder,balance,withdrawLimit);
            System.out.println();
            System.out.print("Enter de amout for withdraw:");
            double withdraw = sc.nextDouble();
            account.withdraw(withdraw);
            System.out.println("New balance: "+account.getBalance());
        }
        catch (WithdrawException e){
            System.out.println("Withdraw error: "+e.getMessage());
        }
        catch(RuntimeException e){
            System.out.println("Unexpected Error!");
        }







    }
}