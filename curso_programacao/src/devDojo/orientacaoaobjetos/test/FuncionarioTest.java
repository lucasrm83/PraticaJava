package devDojo.orientacaoaobjetos.test;

import devDojo.orientacaoaobjetos.dominio.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("lucas");
        funcionario.setIdade(25);
        funcionario.setSalarios (new  double[]{2000,2550,3000,2920});
        funcionario.imprimeDados();
    }
}
