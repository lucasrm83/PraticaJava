package devDojo.orientacaoaobjetos.test;

import devDojo.orientacaoaobjetos.dominio.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor professor = new Professor("null");
        professor.setNome("Yoda");
        professor.setIdade(287);
        professor.setSexo('M');
        //System.out.println(professor.nome+" "+professor.idade+" "+professor.sexo);
        professor.imprime();
    }
}
