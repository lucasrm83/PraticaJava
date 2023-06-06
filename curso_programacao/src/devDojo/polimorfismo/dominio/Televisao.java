package devDojo.polimorfismo.dominio;

public class Televisao extends Produto{
    public static double IMPOSTO_POR_CENTO = 0.24;
    public Televisao(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calculaImposto() {
        System.out.println("Calculando imposto do Televisão");
        return this.valor*IMPOSTO_POR_CENTO;
    }


}
