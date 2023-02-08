public class Funcionario {
    public Integer id;
    public String nome;
    public Double salario;


    public Funcionario(Integer id, String nome, Double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public void aumentoSalario(Double aumento){
        salario+=salario*aumento/100;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public Double getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return "id: " + id +
                ", nome: " + nome + '\'' +
                ", salario: " + salario;
    }
}
