package heranca;

public class Program {
    public static void main(String[] args) {

        //Upcasting
        Account acc = new Account(1001,"Marcos",100.0);
        acc.withdraw(40);
        System.out.println(acc.balance);
        Account acc1 = new SavingsAccount(1002,"Will",400.0,0.01);
        acc1.withdraw(20);
        System.out.println(acc1.getBalance());


    }
}
