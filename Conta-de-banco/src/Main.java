import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Numero da conta: ");
        int numConta = sc.nextInt();
        System.out.println("Dono da conta: ");
        String usuario = sc.nextLine();
        String sn = sc.nextLine();
        Dados dados = new Dados(numConta,usuario);
        if (sn.equals("s")){
            double conta = sc.nextDouble();
            dados.setConta(conta);
        }else {
            dados.setConta(0);
        }

        dados.iniciaConta(sn);
        System.out.println("Acount data:"+ dados);
        System.out.println("Deposito: ");
        double conta = sc.nextDouble();
        dados.deposito(conta);
        System.out.println("Conta atualizada"+dados);
        conta = sc.nextDouble();
        dados.saque(conta);
        System.out.println("Conta atualizada"+ dados);





        System.out.println();

    }
}