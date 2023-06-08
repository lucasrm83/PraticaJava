package devDojo.polimorfismo.dominio;

public class Tomate extends Produto{
    public static final double IMPOSTO_POR_CENTO =0.08;
    public String validade;

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public Tomate(String nome, double valor,String validade) {
        super(nome, valor);
        this.validade =validade;
    }
    @Override
    public double calculaImposto() {
        System.out.println("Calculando imposto do tomate");
        return this.valor*IMPOSTO_POR_CENTO;
    }

}
