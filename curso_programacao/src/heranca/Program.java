package heranca;

public class Program {
    public static void main(String[] args) {
        Account acc = new Account(1001,"Marcos",100.00);
        BusinessAccount bus = new BusinessAccount(1002,"Joe",2000.00, 3000.00);
        Account acc2 = bus;

        System.out.println(bus);

    }
}
