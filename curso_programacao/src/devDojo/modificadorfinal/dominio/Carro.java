package devDojo.modificadorfinal.dominio;

public class Carro {
    private String nome;
    public static final double VELOCIDADE_FINAL;
    public final Comprador COMPRADOR = new Comprador();

    static{
         VELOCIDADE_FINAL=250;

    }
    public void  imprime(){
        System.out.println(this.nome);
    }

    @Override
    public String toString() {
        return "Carro{" +
                "nome='" + nome + '\'' +
                ", COMPRADOR=" + COMPRADOR +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
