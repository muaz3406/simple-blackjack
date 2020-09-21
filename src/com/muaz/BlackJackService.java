package com.muaz;

import java.util.List;
import java.util.Stack;

public class BlackJackService {


    public static void startGame(BlackJackBoard blackJackBoard) {
        Stack<Card> deck = blackJackBoard.getDeck();
        List<Player> playerList = blackJackBoard.getPlayerList();

        for(Player player : playerList) {
           player.addCard(deck.pop());
           player.addCard(deck.pop());
        }
    }

    public static void calculateWinner(BlackJackBoard blackJackBoard) {
        List<Player> playerList = blackJackBoard.getPlayerList();
        Player dealer = playerList.get(0);
        Player player = playerList.get(1);

        blackJackBoard.setWinner(findWinner(player, dealer));
    }

    private static Player findWinner(Player player, Player dealer) {
        if (player.getScore()>21) {
            //player win
            return player;
        }
        if(player.getScore()>17) {
            //draw new card
            return null;
        }
        if (player.getScore()>dealer.getScore()) {
            //dealer win
            return player;
        }
        return dealer;
    }

}
