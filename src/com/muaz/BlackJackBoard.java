package com.muaz;

import java.util.ArrayList;
import java.util.List;

public class BlackJackBoard {
    private List<Player> playerList = new ArrayList<>();
    private List<Card> deckList;
    private Player winner;

    public BlackJackBoard() {
        setDeckList(new Deck().createBlackJackDeck());
        Player dealer = new Player();
        dealer.setName("dealer");

        Player player = new Player();
        player.setName("player");


        this.playerList.add(dealer);
        this.playerList.add(player);
    }

    public void setDeckList(List<Card> deckList) {
        this.deckList = deckList;
    }

    public List<Player> getPlayerList() {
        return playerList;
    }

    public List<Card> getDeckList() {
        return deckList;
    }

    public Player getWinner() {
        return winner;
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
