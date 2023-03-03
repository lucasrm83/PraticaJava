package excecao;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            String[] vector = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vector[position]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid position");
        }
        System.out.println("End");


    }
}
