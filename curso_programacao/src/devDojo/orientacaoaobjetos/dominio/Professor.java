package devDojo.orientacaoaobjetos.dominio;

public class Professor {
    private String nome;
    private int idade;
    private char sexo;

    public Professor(String nome) {
        this.nome = nome;
    }

    public void imprime(){
        System.out.println("-------------");
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.sexo);

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
}
