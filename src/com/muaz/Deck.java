package com.muaz;

import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;


public class Deck {

    private static final String[] values = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
            "Jack", "Queen", "King", "Ace"};
    private static final String[] suit = {"Hearts", "Clubs", "Spades", "Diamonds"};

    public Stack<Card> createBlackJackDeck() {
        Stack<Card> stack = new Stack();

        for (int i = 0; i < values.length; i++) {
            for (int x = 0; x < suit.length; x++) {
                Card card = new Card(values[i], suit[x], getBlackJackValue(values[i]));
                stack.push(card);
            }
        }
        Collections.shuffle(stack);
        return stack;
    }

    private int getBlackJackValue(String value) {
        if("Jack_Queen_King".contains(value)) {
            return 10;
        }
        if("Ace".equals(value)){
            return 10;
        }
        return Arrays.asList(values).indexOf(value)+2;
    }

}
