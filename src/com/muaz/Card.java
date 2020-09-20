package com.muaz;

public class Card{

    private String valueCard;
    private String suitCard;
    private int score;

    public Card(String value, String suit, int score) {
        this.valueCard = value;
        this.suitCard = suit;
        this.score = score;
    }

    public String getValue() {
        return valueCard;
    }
    public String getSuit() {
        return suitCard;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Card{" +
                "valueCard='" + valueCard + '\'' +
                ", suitCard='" + suitCard + '\'' +
                ", score=" + score +
                '}';
    }
}

