package br.com.studiesjava.javacore.association.tests;

import br.com.studiesjava.javacore.association.domain.Player;
import br.com.studiesjava.javacore.association.domain.Team;

public class PlayerTests03 {
    public static void main(String[] args) {
        Player player01 = new Player("Pelé");
        Team team01 = new Team("Brazil");
        Player[] players = {player01};

        player01.setTeam(team01);
        team01.setPlayers(players);

        player01.print();

        System.out.println("-------------------");

        team01.print();
    }
}
