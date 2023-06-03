package devDojo.classesabstratas.test;

import devDojo.classesabstratas.dominio.Desenvolvedor;
import devDojo.classesabstratas.dominio.Funcionario;
import devDojo.classesabstratas.dominio.Gerente;

public class FuncionarioTest {
    public static void main(String[] args) {

        Gerente gerente = new Gerente("william",7000);
        System.out.println(gerente);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Mark",4000);
        System.out.println(desenvolvedor);
        gerente.imprime();
        desenvolvedor.imprime();
    }

}
