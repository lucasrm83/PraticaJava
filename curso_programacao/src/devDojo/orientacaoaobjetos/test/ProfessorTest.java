package devDojo.orientacaoaobjetos.test;

import devDojo.orientacaoaobjetos.dominio.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Yoda";
        professor.idade = 287;
        professor.sexo = 'M';
        System.out.println(professor.nome+" "+professor.idade+" "+professor.sexo);
    }
}
