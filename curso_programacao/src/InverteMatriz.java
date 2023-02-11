import java.util.Scanner;

public class InverteMatriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número de linhas: ");
        int l = sc.nextInt();
        System.out.println("Digite o número de colunas: ");
        int c = sc.nextInt();
        int[][] mat = new int[l][c];
        System.out.println("Digite os números da matriz: ");

        for (int i = 0; i <mat.length ; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = sc.nextInt();

            }

        }
        int[][] matinversa = new int[c][l];
        for (int i = 0; i <mat.length ; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.println("Mat"+mat);
                System.out.println("Matinversa"+matinversa);
                matinversa[i][j] = mat[j][i];



            }

        }
        System.out.println("Matriz inicial: "+mat);
        System.out.println("Matriz trasposta: "+matinversa);
    }
}
