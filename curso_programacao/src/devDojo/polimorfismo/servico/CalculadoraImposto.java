package devDojo.polimorfismo.servico;

import devDojo.polimorfismo.dominio.Computador;
import devDojo.polimorfismo.dominio.Tomate;
import devDojo.polimorfismo.dominio.Produto;

public class CalculadoraImposto {
    public static void calcularImposto(Produto produto){
        System.out.println("Relatorio de imposto produto: ");
        double imposto = produto.calculaImposto();
        System.out.println("Produto: "+produto.getNome());
        System.out.println("Valor: "+produto.getValor());
        System.out.println("Imposto a ser pago: "+imposto);
    }
}
