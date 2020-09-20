package com.muaz;

import java.util.List;
import java.util.Random;

public class BlackJackService {


    public static void startGame(BlackJackBoard blackJackBoard) {
        List<Card> deckList = blackJackBoard.getDeckList();
        List<Player> playerList = blackJackBoard.getPlayerList();

        Random rand = new Random();

        for(Player player : playerList) {
            for (int i = 0; i < 2; i++) {
                int randomIndex = rand.nextInt(deckList.size());
                Card card = deckList.get(randomIndex);
                player.addCard(card);
            }
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
