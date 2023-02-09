import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o tamanho da matriz: ");
        int tamanho = sc.nextInt();
        //Cria matriz e adiciona elementos nos determinados lugares
        int[][] mat = new int[tamanho][tamanho];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = sc.nextInt();
                
            }
            
        }
        //Printa a diagonal principal, já que os elementos sempre estao no mesmo indece de linha e coluna
        System.out.println("Diagonal principal: ");
        for (int i = 0; i <mat.length ; i++) {
            System.out.print(mat[i][i]+" ");

        }
        int contador =0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j]<0){
                    contador++;
                }

            }

        }
        System.out.println("");
        System.out.println("Quantidade de números negativos: "+contador);



    }
}
