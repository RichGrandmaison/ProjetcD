package com.rich.projetcd;

import android.util.Log;

import com.rich.projetcd.cards.Card;
import com.rich.projetcd.cards.actions.Action;
import com.rich.projetcd.cards.treasures.Copper;
import com.rich.projetcd.cards.treasures.Silver;
import com.rich.projetcd.cards.treasures.Treasure;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Rich on 2015-11-13.
 * Represents a Player
 * Can call methods conresponding to actions a player may take, such as drawing cards, shuffling a new deck.
 */
public class Player {

    private static final String TAG = "Player Logs";

    public String name;
    public int points = 0;
    public OwnedCards ownedCards; //all your cards
    public Discard discardPile; //cards in the discard pile
    public Played playedCards; //cards discarded this turn, but not yet in the Discard pile.
    public Deck deck; //cards from which you draw
    public Hand hand; //cards in your hand
    public Turn turn; //TODO


    public Player() {
        
        this.ownedCards = new OwnedCards(this);
        this.discardPile = new Discard(this);
        this.playedCards = new Played(this);
        this.deck = new Deck(this);
        this.hand = new Hand(this);
        
    }

    public void generateInitialDeck() {deck.generateInitialDeck(this);}

    public void generateHand() {
        hand.generateHand();
    }

    public void drawCards(int draws) {
        hand.drawCards(draws);
    }

    public void buyCard(Card c) {

       c.addedToDeck(this);
        this.turn.cash -= c.getCardCost();
        this.turn.decrementBuys(1);

    }

    public void trashCard(Card c) {

    }

    public void playAction(Card c) {
        Log.i(TAG, "+++++ played " + c.getCardName());
        c.play(this.turn);
    }

    public void playTreasure(Card c) {
        if (c.isTreasure()) {
            c.play(this.turn);
            Log.i(TAG, "+++++ played " + c.getCardName());
        } else {
            Log.i(TAG, "---Card is not a treasure!");
        }
    }

    public void chooseBuys() {
        Log.i(TAG, "buy phase");
        if(this.turn.cash > 2) {
            turn.player.buyCard(new Silver());
        }
        else turn.player.buyCard(new Copper());
    }

}

