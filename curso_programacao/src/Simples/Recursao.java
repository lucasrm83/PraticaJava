package Simples;

public class Recursao {
    public static void main(String[] args) {



    }

    private static int soma(int a, int b) {
        int x =0;
        int y= 3;
        if(a<b){
            System.out.println(b);
            soma(a,b-1);
            System.out.println("here?");
            return a;

        }
        return a;
    }
}
