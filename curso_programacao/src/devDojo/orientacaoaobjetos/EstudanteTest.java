package devDojo.orientacaoaobjetos;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();

        estudante.idade = 18;
        estudante.nome ="rykardd";
        estudante.sexo ='M';

        Estudante estudante1 = new Estudante();
        estudante1.idade =16;
        estudante1.nome="Ranni";
        estudante1.sexo='F';

        System.out.println(estudante);
        System.out.println(estudante1);
    }
}
