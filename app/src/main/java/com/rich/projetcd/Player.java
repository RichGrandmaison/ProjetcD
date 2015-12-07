package com.rich.projetcd;

import android.util.Log;

import com.rich.projetcd.cards.treasures.*;
import com.rich.projetcd.cards.victories.*;

/**
 * Created by Rich on 2015-11-13.
 */
public class Player {

    private static final String TAG = "Player Logs";

    private String name;
    private int points = 0;
    public OwnedCards ownedCards; //all your cards
    Discard discardPile; //cards in the discard pile
    Played playedCards; //cards discarded this turn, but not yet in the Discard pile.
    Deck deck; //cards from which you draw
    Hand hand; //cards in your hand


    public Player() {
        
        this.ownedCards = new OwnedCards();
        this.discardPile = new Discard();
        this.playedCards = new Played();
        this.deck = new Deck();
        this.hand = new Hand();
        
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

    public void generateInitialDeck() {

        for (int i = 0; i < 7; i++) {
            Copper copper = new Copper();
            deck.addCardToTopOfDeck(copper);
            ownedCards.addCardtoOwnedCards(copper);
        }
        for (int i = 0; i < 3; i++) {
            Estate estate = new Estate();
            deck.addCardToTopOfDeck(estate);
            ownedCards.addCardtoOwnedCards(estate);
        }

        deck.shuffle();
    }


    public void generateHand() {
        hand.generateHand(this);
    }

    public void drawCards(int draws) {
        for(int i = 0; i < draws; i++) {
            if(!deck.isEmpty()) {
                hand.addToHand(deck.drawTopCard());
                Log.i(TAG, "Drew a card");
            }
            else {
                deck.cards = discardPile.shuffleAndMakeDeck();
                hand.addToHand(deck.drawTopCard());
            }
        }

    }
}
