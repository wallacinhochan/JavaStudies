package br.com.studiesjava.javacore.association.tests;

import br.com.studiesjava.javacore.association.domain.Player;

public class PlayerTests {
    public static void main(String[] args) {
        Player player1 = new Player("Pelé");
        Player player2 = new Player("Romário");
        Player player3 = new Player("Cafu");

        Player[] players = {player1, player2, player3};

        for (Player player : players) {
            player.print();
        }

    }
}
