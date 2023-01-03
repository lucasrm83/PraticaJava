import java.util.Scanner;

public class Main {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Nome do produto: ");
        String nome = sc.nextLine();
        System.out.println("Preco do produto: ");
        double preco = sc.nextDouble();

        System.out.println();
        Produto produto = new Produto(nome,preco);
        


        System.out.println("Product data: " +produto);
        System.out.println();
        System.out.println("Quantos produtos a serem adicionados no estoque?: ");
        int quantidade = sc.nextInt();
        produto.addProduto(quantidade);
        System.out.println("Updated data: " +produto);
        System.out.println();
        System.out.println("Quantos produtos a serem removidos no estoque?: ");
        quantidade = sc.nextInt();
        produto.removeProduto(quantidade);
        System.out.println("Updated data: " +produto);
        System.out.println();


        sc.close();



    }
}

