import java.util.Scanner;

public class Tmain {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        Triangulo t1, t2;
        t1 = new Triangulo();
        t2 = new Triangulo();
        System.out.println("Digite os tres lados do triangulo x: ");
        t1.a = sc.nextDouble();
        t1.b = sc.nextDouble();
        t1.c = sc.nextDouble();
        System.out.println("Digite os tres lados do triangulo y: ");
        t2.a = sc.nextDouble();
        t2.b = sc.nextDouble();
        t2.c = sc.nextDouble();
        double rx = t1.Soma();
        double ry = t2.Soma();
        System.out.printf("O resultado de x é: %.4f%n",rx);
        System.out.printf("O resulato de y é: %.4f%n,", ry);

    }
}
