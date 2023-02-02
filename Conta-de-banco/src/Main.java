import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dados dados;


        System.out.println("Numero da conta: ");
        int numConta = sc.nextInt();
        sc.nextLine();
        System.out.println("Dono da conta: ");
        String usuario = sc.nextLine();

        System.out.println("Há um deposito inicial? s/n: ");
        char resposta = sc.next().charAt(0);
        if (resposta == 's'){
            System.out.println("Digitar valor inicial: ");
            double conta = sc.nextDouble();
            dados = new Dados(numConta,usuario, conta);
        }else {
            dados = new Dados(numConta, usuario);
        }

        System.out.println("Acount data: "+ dados);
        System.out.println("Deposito: ");
        double conta = sc.nextDouble();
        dados.deposito(conta);
        System.out.println("Conta atualizada: "+dados);
        System.out.println("Efetue saque da conta: ");
        conta = sc.nextDouble();
        dados.saque(conta);
        System.out.println("Conta atualizada: "+ dados);





        System.out.println();

    }
}