package devDojo.modificadorfinal.dominio;

public class Carro {
    private String nome;
    public static final double VELOCIDADE_FINAL;

    static{
         VELOCIDADE_FINAL=250;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
