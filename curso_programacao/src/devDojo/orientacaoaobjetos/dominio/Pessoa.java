package devDojo.orientacaoaobjetos.dominio;

public class Pessoa {
    private String nome;
    private int idade;

    public int getIdade(){
        return this.idade;
    }
    public String getNome(){
        return this.nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);
    }
}
