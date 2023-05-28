package devDojo.orientacaoaobjetos.test;

import devDojo.orientacaoaobjetos.dominio.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome="Lucas";
        funcionario.idade=25;
        funcionario.salarios = new  double[]{2000,2550,3000,2920};
        funcionario.imprimeDados();
    }
}
