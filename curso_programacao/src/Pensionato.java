import java.util.Scanner;

public class Pensionato {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Estudante[] quartos = new Estudante[10];
        System.out.println("Quantidade de estudantes: ");
        int n = sc.nextInt();
        for (int i=0;i<n;i++){
            sc.nextLine();
            System.out.println("Nome do estudante: ");
            String nome = sc.nextLine();
            System.out.println("Email do estudante: ");
            String email = sc.nextLine();
            System.out.println("Quarto escolhido: ");
            int quarto = sc.nextInt();
            quartos[quarto] = new Estudante(nome,email,quarto);

        }
        for (int i=0; i<quartos.length;i++){
            if (quartos[i] != null){
                System.out.println(quartos[i].getQuarto()+": " +"Nome: "+quartos[i].getNome()+", Email: "+quartos[i].getEmail());
            }
        }

    }
}
