package br.com.studiesjava.javacore.bootblocks.tests;

import br.com.studiesjava.javacore.bootblocks.domain.Anime;

public class AnimeTests01 {
    public static void main(String[] args) {
        Anime anime = new Anime("One piece");


        System.out.println(anime.getName());
        for (int cap : anime.getCaps()) {
            System.out.print(cap + " ");
        }


    }
}
