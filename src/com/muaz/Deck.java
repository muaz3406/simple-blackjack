package com.muaz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Deck {

    private static final String[] value = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
            "Jack", "Queen", "King", "Ace"};
    private static final String[] suit = {"Hearts", "Clubs", "Spades", "Diamonds"};

    public List<Card> createBlackJackDeck() {
        List<Card> deckList = new ArrayList<>();

        for (int i = 0; i < value.length; i++) {
            for (int x = 0; x < suit.length; x++) {
                Card card = new Card(value[i], suit[x], getBlackJackValue(value[i], suit[x]));
                deckList.add(card);
            }
        }
        return deckList;
    }

    private int getBlackJackValue(String value, String suit) {
        if("Jack_Queen_King".contains(value)) {
            return 10;
        }
        if("Ace".equals(value)){
            return 10;
        }
        return Arrays.asList(this.value).indexOf(value)+2;
    }

}
