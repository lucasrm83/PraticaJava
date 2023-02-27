package heranca;

public class Program {
    public static void main(String[] args) {

        //Upcasting
        Account acc = new Account(1001,"Marcos",100.0);
        BusinessAccount bus = new BusinessAccount(1002,"Joe",2000.0, 3000.0);
        Account acc1 = bus;
        Account acc2 = new BusinessAccount(1003,"Mark",20.00,200.0);
        Account acc3 = new SavingsAccount(1004,"Julian",400.0,0.02);

        //Downcasting

        BusinessAccount acc4 = (BusinessAccount)acc2;
        //A linha abaixo dá erro pq acc3 não é uma instancia de businessacount, a ide não vai apontar o erro, somente o compilador
        //BusinessAccount acc5 = (BusinessAccount) acc3;
        if (acc3 instanceof BusinessAccount){
            BusinessAccount acc5 = (BusinessAccount) acc3;
            System.out.println("acc3 é instancia de BusinessAcount");
        }
        if (acc3 instanceof SavingsAccount){
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("acc3 é instancia de Saving account");

        }





        //System.out.println(bus);

    }
}
