package br.com.studiesjava.javacore.constructor.tests;


import br.com.studiesjava.javacore.constructor.domain.Anime;

public class AnimeTestes {
    public static void main(String[] args) {
        Anime anime = new Anime("Dr Stone", "TV", 5, 10);

        //anime.init("Dragon Ball Z", "TV", 5);

        anime.print();

        //anime.init("Dragon Ball Z", "TV", 5, 10);
    }


}
