import java.util.Scanner;

public class ExercicioMatrizes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int c = sc.nextInt();
        int[][] mat = new int[l][c];

        for (int i = 0; i <mat.length ; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = sc.nextInt();

            }

        }
        int x =sc.nextInt();

        for (int i = 0; i <mat.length ; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] ==x){
                    System.out.println("Posição: "+  i+","+j);
                    if (j!=0){
                        System.out.println("Esquerda: "+mat[i][j-1]);
                    }
                    //System.out.println("Valor mat.lenght: "+ mat[i].length);
                    //System.out.println("Valor j: "+ j);
                    if(j+1<mat[i].length){
                        System.out.println("Direita: "+mat[i][j+1]);
                    }
                    if (i!=0){
                        System.out.println("Acima: "+mat[i-1][j]);
                    }
                    if(i+1< mat.length){
                        System.out.println("Abaixo: "+mat[i+1][j]);
                    }





                }

            }

        }
    }
}
