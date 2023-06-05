package devDojo.polimorfismo.dominio;

public class Computador extends Produto{
    public static double IMPOSTO_POR_CENTO = 0.21;
    public Computador(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calculaImposto() {
        System.out.println("Calculando imposto do computador");
        return this.valor*IMPOSTO_POR_CENTO;
    }

    public static double getImpostoPorCento() {
        return IMPOSTO_POR_CENTO;
    }
}
