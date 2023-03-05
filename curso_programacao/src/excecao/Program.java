package excecao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        System.out.println("Start");
        metodo1();

    }
    public  static void metodo1(){
        System.out.println("Metodo1 start");
        metodo2();
    }
    public static void metodo2(){
        Scanner sc = new Scanner(System.in);
        try {
            String[] vector = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vector[position]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid position");
            e.printStackTrace();
        }
        catch (InputMismatchException e){
            System.out.println("Input error:");
        }
        finally {
            System.out.println("End");
        }




    }

}
