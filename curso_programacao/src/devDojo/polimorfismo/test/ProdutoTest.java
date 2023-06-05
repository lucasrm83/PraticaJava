package devDojo.polimorfismo.test;

import devDojo.polimorfismo.dominio.Computador;
import devDojo.polimorfismo.dominio.Tomate;
import devDojo.polimorfismo.servico.CalculadoraImposto;

public class ProdutoTest {
    public static void main(String[] args) {
        Computador computador = new Computador("Acer nitro 5",5000);
        Tomate tomate = new Tomate("Tomate vermelho",10);
        CalculadoraImposto.calculaImpostoComputador(computador);
        System.out.println("--------");
        CalculadoraImposto.calculaImpostoTomate(tomate);


    }
}
