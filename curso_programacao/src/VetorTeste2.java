import java.util.Scanner;

public class VetorTeste2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Produto[] vector = new Produto[n];
        for (int i=0; i< vector.length; i++){
            sc.nextLine();
            String nome = sc.nextLine();
            Double preco = sc.nextDouble();
            vector[i] = new Produto(nome,preco);

        }
        double soma = 0.0;
        for (int i=0; i< vector.length;i++){
            soma += vector[i].getPreco();

        }
        double media = soma / vector.length;
        System.out.printf("%.2f%n" ,media);
        sc.close();

    }
}
