package devDojo.orientacaoaobjetos.test;

import devDojo.orientacaoaobjetos.dominio.Jogador;

public class JogadorTest {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Zico");
        Jogador jogador2 = new Jogador("Cristiano");
        Jogador jogador3 = new Jogador("Ronaldo");
        Jogador [] jogadores = {jogador1,jogador2,jogador3};
        for (Jogador jogador:jogadores) {
            jogador.imprime();

        }
    }
}
