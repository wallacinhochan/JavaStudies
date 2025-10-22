package br.com.studiesjava.javacore.bootblocks.domain;

public class Anime {
    private String name;
    private int[] caps;

    {
        this.caps = new int[100];

        for (int i = 0; i < caps.length; i++) {
            caps[i] = i + 1;
        }
    }

    public Anime(String name) {
        this.name = name;
    }

    public Anime() {

        for (int i : this.caps) {
            System.out.print(i + " ");
        }


    }

    public String getName() {
        return name;
    }

    public int[] getCaps() {
        return caps;
    }
}
