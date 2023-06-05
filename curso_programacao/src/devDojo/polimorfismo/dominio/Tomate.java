package devDojo.polimorfismo.dominio;

public class Tomate extends Produto{
    public static final double IMPOSTO_POR_CENTO =0.86;
    public Tomate(String nome, double valor) {
        super(nome, valor);
    }
    @Override
    public double calculaImposto() {
        System.out.println("Calculando imposto do tomate");
        return this.valor*IMPOSTO_POR_CENTO;
    }

}
