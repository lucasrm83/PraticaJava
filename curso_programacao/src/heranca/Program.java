package heranca;

public class Program {
    public static void main(String[] args) {


        Account acc = new Account(1001,"Marcos",100.0);
        acc.withdraw(40);
        System.out.println(acc.balance);
        Account acc1 = new SavingsAccount(1002,"Will",400.0,0.01);
        acc1.withdraw(20);
        System.out.println(acc1.getBalance());
        Account acc2 = new BusinessAccount(1003, "Joe",800.0,200.0);
        acc2.withdraw(100);
        System.out.println(acc2.getBalance());


    }
}
