package devDojo.orientacaoaobjetos.test;

import devDojo.orientacaoaobjetos.dominio.Pessoa;

public class PessoaTest {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("william");
        pessoa.setIdade(28);
        pessoa.imprime();
    }
}
