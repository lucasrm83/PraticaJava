package devDojo.orientacaoaobjetos.dominio;

public class Estudante {
    public String nome;
    public int idade;
    public char sexo;

    @Override
    public String toString() {
        return "Estudante{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", sexo=" + sexo +
                '}';
    }
}

