package com.muaz;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BlackJackBoard blackJackBoard = new BlackJackBoard();
        BlackJackService.startGame(blackJackBoard);
        BlackJackService.calculateWinner(blackJackBoard);
        System.out.println(blackJackBoard);
    }
}
