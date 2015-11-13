package com.rich.projetcd;

/**
 * Created by Rich on 2015-11-13.
 */
public class Player {

    private String playerName;
    Deck deck; //all your cards
    Discard discardPile; //cards in the discard pile
    Played played; //cards discarded this turn, but not yet in the Discard pile.
    Playable playable; //cards from which you draw
    Hand hand; //cards in your hand

    public Player() {
    }

    private void setPlayerName(String name) {
        this.playerName = name;
    }

    private String getPlayerName() {
        return this.playerName;
    }

}
