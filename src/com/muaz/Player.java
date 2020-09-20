package com.muaz;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private List<Card> cardList = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Card> getCardList() {
        return cardList;
    }

    public void setCardList(List<Card> cardList) {
        this.cardList = cardList;
    }

    public void addCard(Card card) {
        this.cardList.add(card);
    }


    public int getScore() {
        List<Card> aceList = new ArrayList<>();

        return cardList.stream()
        .reduce(0, (score, card) -> score + card.getScore(), Integer::sum);

    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", cardList=" + cardList +
                '}';
    }
}
