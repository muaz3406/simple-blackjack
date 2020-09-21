package com.muaz;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BlackJackBoard {
    private List<Player> playerList = new ArrayList<>();
    private Stack deck;
    private Player winner;

    public BlackJackBoard() {
        deck = new Deck().createBlackJackDeck();
        Player dealer = new Player();
        dealer.setName("dealer");

        Player player = new Player();
        player.setName("player");


        this.playerList.add(dealer);
        this.playerList.add(player);
    }

    public List<Player> getPlayerList() {
        return playerList;
    }

    public Stack getDeck() {
        return deck;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    @Override
    public String toString() {
        return "BlackJackBoard{" +
                "playerList=" + playerList +
                ", winner=" + winner +
                '}';
    }
}
