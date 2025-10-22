package br.com.studiesjava.javacore.association.domain;

public class Team {
    private String name;
    private Player[] players;

    public Team(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println(this.name);
        if (players == null){
            return;
        }
        else{
            for (Player player : players) {
                System.out.println(player.getName());
            }

        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Player[] getPlayers() {
        return players;
    }

    public void setPlayers(Player[] players) {
        this.players = players;
    }
}
