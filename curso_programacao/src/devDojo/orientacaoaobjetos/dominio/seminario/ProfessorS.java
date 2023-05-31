package devDojo.orientacaoaobjetos.dominio.seminario;

public class ProfessorS {
    private String nome;
    private String especialidade;
    private Seminario [] seminarios;

    public ProfessorS(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public void imprime(){
        System.out.println("---- Professor ----");
        System.out.println(this.nome);
        System.out.println(this.especialidade);
        System.out.println("Seminários:");
        if (seminarios == null){
            System.out.println("Nenhum seminário");

        }
        for (Seminario seminario:seminarios) {
            seminario.imprime();

        }


    }

    public ProfessorS(String nome, String especialidade, Seminario[] seminarios) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
