package Simples;

import java.util.Scanner;

public class TesteIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        if(x<21){
            System.out.println(x);
        }
        if (x==20) {
            System.out.println("cheguei");

        }

    }
}
