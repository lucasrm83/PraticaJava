import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Raio: ");
        double raio = sc.nextDouble();
        double c = Calculator.circunference(raio);
        double v = Calculator.volume(raio);
        sc.close();
        System.out.printf("Circurference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI: %.2f%n", Calculator.PI);
    }

}