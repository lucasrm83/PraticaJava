package devDojo.polimorfismo.servico;

import devDojo.polimorfismo.dominio.Computador;
import devDojo.polimorfismo.dominio.Tomate;
import devDojo.polimorfismo.dominio.Produto;

public class CalculadoraImposto {
    public static void calcularImposto(Produto produto){
        System.out.println("Relatorio de Imposto Produto: ");
        double imposto = produto.calculaImposto();
        System.out.println("Produto: "+produto.getNome());
        System.out.println("Valor: "+produto.getValor());
        System.out.println("Imposto a ser pago: "+imposto);
        if (produto instanceof Tomate){
            Tomate tomate =(Tomate) produto;
            System.out.println("Validade: "+tomate.getValidade());

        }
    }
}
