package devDojo.heranca.test;

import devDojo.heranca.Endereco;
import devDojo.heranca.Funcionario;
import devDojo.heranca.Pessoa;

public class FuncionarioTest {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Rua do sol", "58958-000");
        Pessoa pessoa = new Pessoa("Marcus aurelius", "01101249823",endereco);
        Funcionario funcionario = new Funcionario("Darius","08954782180",endereco,800);
        funcionario.imprime();
        //pessoa.imprime();

    }
}
