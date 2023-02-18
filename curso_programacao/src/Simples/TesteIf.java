package Simples;

import java.util.Scanner;

public class TesteIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        if(x<20){
            x+=1;
            System.out.println(x);
        }
        while (x!=13){
            System.out.println("Erro!");
            x=sc.nextInt();

        }
    }
}
