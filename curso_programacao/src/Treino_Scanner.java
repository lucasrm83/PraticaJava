
import java.util.Scanner;

public class Treino_Scanner {
    public static void main(String[] args){
        String product1 = "Computer";
        String product2 = "Office Desk";
        String x;


        int age = 30;
        Scanner sc = new Scanner(System.in);
        x = sc.next();
        /* Scanner é parecido com o input do python, mas precisa ser aberto e fechado quando
        necessário. Cuidado ao capturar strings seguidos de inteiros, já que a quebra de linha
        conta como um input ao capturar inteiros.
         */
        System.out.println(x);

        int code = 5299;
        char gender = 'F';

        double price1 = 2100.00;
        sc.close();

    }


}
