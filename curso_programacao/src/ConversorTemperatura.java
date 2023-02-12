import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a temperatura em celcius: ");
        Double c = sc.nextDouble();
        Double f = 9*c/5+32;
        System.out.println("Temperatura em fahrenheit: "+f);
    }
}
