package devDojo.orientacaoaobjetos.dominio.seminario;

public class Aluno {
    private String nome;
    private int idade;

    private Seminario seminario;

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Aluno(String nome, int idade, Seminario seminario) {
        this.nome = nome;
        this.idade = idade;
        this.seminario = seminario;
    }

    public void imprime(){
        System.out.println("---- Aluno ----");
        System.out.println(this.nome);
        System.out.println(this.idade);
        if (seminario == null){
            System.out.println("nenhum seminário");

        }
        System.out.println(seminario.getTitulo());


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
}
