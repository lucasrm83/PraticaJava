package devDojo.orientacaoaobjetos.dominio.seminario;

public class Seminario {
    private String titulo;
    private Local local;
    private Aluno [] alunos;

    public Seminario(String titulo, Local local) {
        this.titulo = titulo;
        this.local = local;
    }

    public Seminario(String titulo,  Local local,Aluno[] alunos) {
        this.titulo = titulo;
        this.local = local;
        this.alunos = alunos;
    }

    public void imprime() {
        System.out.println("---- Seminarios ----");
        System.out.println("Título: "+this.titulo);
        System.out.println("Endereço: "+local.getEndereco());
        if (alunos == null) {
            System.out.println("Nenhum aluno!");

        }
        System.out.println("Alunos: ");
        for (Aluno aluno : alunos) {
            System.out.println(aluno.getNome());

        }

    }
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }
}
