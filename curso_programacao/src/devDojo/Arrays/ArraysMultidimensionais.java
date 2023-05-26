package devDojo.Arrays;

public class ArraysMultidimensionais {
    public static void main(String[] args) {
        int[][] dias = {{1,2,3},{4,5,6},{7,8,9}};
        //Array com número de colunas personalizadas
        int [][] personalized = {{1,2},{3,4,5,6},{7,8,9,10,11}};
        for (int i = 0; i <dias.length ; i++) {
            for (int j = 0; j < dias[i].length; j++) {

                System.out.print(dias[i][j]+"\t");

            }
            System.out.println();

        }
        System.out.println("-------------------");
        for (int[] arrBase:dias) {
            for (int num:arrBase){
                System.out.print(num+"\t");
            }
            System.out.println();

        }

    }
}
