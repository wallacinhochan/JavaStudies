package br.com.studiesjava.javacore.staticacess.domain;

public class Anime {
    private String name;
    private static int[] caps;

    static {
        Anime.caps = new int[100];

        for (int i = 0; i < caps.length; i++) {
            caps[i] = i + 1;
            System.out.print(i + 1 + " ");
        }
        System.out.println();
    }



    public Anime(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public int[] getCaps() {
        return caps;
    }
}
