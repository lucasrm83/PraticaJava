package devDojo.orientacaoaobjetos.test;

import devDojo.orientacaoaobjetos.dominio.seminario.Aluno;
import devDojo.orientacaoaobjetos.dominio.seminario.Local;
import devDojo.orientacaoaobjetos.dominio.seminario.ProfessorS;
import devDojo.orientacaoaobjetos.dominio.seminario.Seminario;

public class SeminarioTest {
    public static void main(String[] args) {
        Local local1 = new Local("Joao pessoa");
        Seminario seminario1 = new Seminario("Importancia de algoritmons e estrutura de dados",local1 );
        Seminario seminario2 = new Seminario("Empregabilidade em tempos de crise", local1);
        Aluno aluno1 = new Aluno("Lucas",25,seminario1);
        Aluno aluno2 = new Aluno("Marcos",22,seminario1);
        Aluno aluno3 = new Aluno("Felipe",18,seminario2);
        Aluno aluno4 = new Aluno("Joao",28,seminario2);
        Aluno aluno5 = new Aluno("Antonio",32,seminario1);
        Aluno [] alunos1 = {aluno1,aluno2};
        Aluno [] alunos2 = {aluno3,aluno4,aluno5};
        seminario1.setAlunos(alunos1);
        seminario2.setAlunos(alunos2);
        Seminario [] seminarios = {seminario1,seminario2};
        ProfessorS professor1 = new ProfessorS("Manoel","Estrutura de dados",seminarios);
        ProfessorS professor2 = new ProfessorS("Chandrasekar", "Matemática discreta",seminarios);
        professor1.imprime();
        aluno1.imprime();
        seminario1.imprime();







    }
}
