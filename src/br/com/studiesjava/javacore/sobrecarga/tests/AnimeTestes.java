package br.com.studiesjava.javacore.sobrecarga.tests;

import br.com.studiesjava.javacore.sobrecarga.domain.Anime;

public class AnimeTestes {
    public static void main(String[] args) {
        Anime anime = new Anime();

        anime.init("Dragon Ball Z", "TV", 5);

        anime.print();

        anime.init("Dragon Ball Z", "TV", 5, 10);

        anime.print();
    }


}
