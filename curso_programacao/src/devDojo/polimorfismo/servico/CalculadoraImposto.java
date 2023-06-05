package devDojo.polimorfismo.servico;

import devDojo.polimorfismo.dominio.Computador;
import devDojo.polimorfismo.dominio.Tomate;

public class CalculadoraImposto {
    public static void calculaImpostoComputador(Computador computador){
        System.out.println("Relatorio de imposto computador");
        double imposto = computador.calculaImposto();
        System.out.println("Computador: "+computador.getNome());
        System.out.println("Valor: "+computador.getValor());
        System.out.println("Imposto a ser pago: "+imposto);
    }

    public static void calculaImpostoTomate(Tomate tomate){
        System.out.println("Relatorio de imposto tomate");
        double imposto = tomate.calculaImposto();
        System.out.println("Tomate: "+tomate.getNome());
        System.out.println("Valor: "+tomate.getValor());
        System.out.println("Imposto a ser pago: "+imposto);
    }
}
