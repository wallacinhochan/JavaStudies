package br.com.studiesjava.javacore.constructor.domain;

public class Anime {

    private String name;
    private String type;
    private int episode;
    private int stars;
    private String stream;


    public Anime(String name, String type, int episode, int stars) {
        this.name = name;
        this.type = type;
        this.episode = episode;
        this.stars = stars;

    }

    public Anime(String name, String type, int episode, int stars, String stream) {
        this(name, type, episode, stars);
        this.stream = stream;
    }

    public void init(String name, String type, int episode) {
        this.name = name;
        this.type = type;
        this.episode = episode;
    }

    public void init(String name, String type, int episode, int stars) {
        this.init(name, type, episode);
        this.stars = stars;
    }


    public void print() {
        System.out.println(this.name);
        System.out.println(this.type);
        System.out.println(this.episode);
        System.out.println(this.stars);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getEpisode() {
        return episode;
    }

    public void setEpisode(int episode) {
        this.episode = episode;
    }
}
