package devDojo.orientacaoaobjetos.test;

import devDojo.orientacaoaobjetos.dominio.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Akira",1,1998,"sci-fi");
        anime.imprime();

    }
}
