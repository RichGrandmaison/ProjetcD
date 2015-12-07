package com.rich.projetcd;

import com.rich.projetcd.cards.treasures.*;
import com.rich.projetcd.cards.actions.*;
import com.rich.projetcd.cards.victories.*;

/**
 * Created by Rich on 2015-11-13.
 */
public class Player {

    private String name;
    private int points = 0;
    public Deck deck; //all your cards
    Discard discardPile; //cards in the discard pile
    Played playedCards; //cards discarded this turn, but not yet in the Discard pile.
    Playable deckCards; //cards from which you draw
    Hand hand; //cards in your hand


    public Player() {
        
        this.deck = new Deck();
        this.discardPile = new Discard();
        this.playedCards = new Played();
        this.deckCards = new Playable();
        
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
    
    public void generateInitialDeck() {
        for (int i = 0; i < 7; i++) {
            deck.addCardtoDeck(new Copper());
        }
        for (int i = 0; i < 3; i++) {
            deck.addCardtoDeck(new Estate());
        }

    }
}
