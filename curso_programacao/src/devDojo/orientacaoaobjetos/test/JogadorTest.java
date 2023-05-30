package devDojo.orientacaoaobjetos.test;

import devDojo.orientacaoaobjetos.dominio.Jogador;
import devDojo.orientacaoaobjetos.dominio.Time;

public class JogadorTest {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Zico");
        Time time = new Time("vasco");
        jogador1.imprime();
        jogador1.setTime(time);
        jogador1.imprime();
    }
}
