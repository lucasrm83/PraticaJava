package devDojo.orientacaoaobjetos.test;

import devDojo.orientacaoaobjetos.dominio.Escola;
import devDojo.orientacaoaobjetos.dominio.Professor;

public class EscolaTest {
    public static void main(String[] args) {
        Professor professor = new Professor("Linus");
        Professor professor2= new Professor("Obi wan");
        Professor [] professors = {professor,professor2};
        Escola escola = new Escola("Jedi",professors);
        escola.imprime();
    }
}
