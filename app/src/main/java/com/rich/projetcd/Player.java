package com.rich.projetcd;

/**
 * Created by Rich on 2015-11-13.
 */
public class Player {

    private String name;
    private int points = 0;
    Deck deck; //all your cards
    Discard discardPile; //cards in the discard pile
    Played playedCards; //cards discarded this turn, but not yet in the Discard pile.
    Playable deckCards; //cards from which you draw
    Hand hand; //cards in your hand


    public Player() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public void drawCards(int draws) {

        }
}
