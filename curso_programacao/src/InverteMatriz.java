import java.util.Scanner;

public class InverteMatriz {
    public static void main(String[] args) {
        //Para matrizes personálizadas, se necessário
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número de linhas: ");
        int l = sc.nextInt();
        System.out.println("Digite o número de colunas: ");
        int c = sc.nextInt();
        System.out.println("Matriz normal");*/

        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        for (int i = 0; i <mat.length ; i++) {
            for (int j = 0; j < mat[i].length; j++) {

                System.out.print(mat[i][j]+"\t");

            }
            System.out.println();

        }
        int[][] matinversa = new int[mat[0].length][mat.length];
        for (int i = 0; i <mat.length ; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (i<j || i>j){
                    matinversa[i][j] = mat[j][i];
                }
                if(i==j){
                    matinversa[i][j] = mat[i][j];
                }



            }


        }
        System.out.println("Matriz inversa");
        for (int i = 0; i <matinversa.length ; i++) {
            for (int j = 0; j < matinversa[i].length; j++) {
                System.out.print(matinversa[i][j]+"\t");

            }
            System.out.println();

        }

    }
}
