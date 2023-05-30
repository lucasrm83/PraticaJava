package devDojo.orientacaoaobjetos.test;

import devDojo.orientacaoaobjetos.dominio.Jogador;
import devDojo.orientacaoaobjetos.dominio.Time;

public class JogadorTest {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Zico");
        Jogador jogador2 = new Jogador("Romario");
        Time time = new Time("flamengo");
        Jogador [] jogadores = {jogador1,jogador2};
        jogador1.setTime(time);
        jogador2.setTime(time);
        time.setJogadores(jogadores);
        System.out.println("---Jogadores---");
        jogador1.imprime();
        System.out.println("---time---");
        time.imprime();
    }
}
