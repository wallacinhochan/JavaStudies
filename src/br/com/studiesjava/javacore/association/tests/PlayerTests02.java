package br.com.studiesjava.javacore.association.tests;

import br.com.studiesjava.javacore.association.domain.Player;
import br.com.studiesjava.javacore.association.domain.Team;

public class PlayerTests02 {
    public static void main(String[] args) {
        Player player1 = new Player("Pelé");
        Team team1 = new Team("Brazil");

        player1.setTeam(team1);
        player1.print();

    }
}
