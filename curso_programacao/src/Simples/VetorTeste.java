package Simples;

import java.util.Scanner;

public class VetorTeste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o tamanho do vetor: ");
        int vsize = sc.nextInt();
        double[] vector = new double[vsize];
        for (int i=0; i<vsize;i++){
            vector[i] = sc.nextDouble();
        }
        double soma = 0.0;
        for (int i=0; i<vsize; i++){
            soma += vector[i];

        }
        double avg = soma / vsize;
        System.out.println("Altura média é: " + avg);







        sc.close();
    }
}
