package com.rich.projetcd;

import android.util.Log;

import com.rich.projetcd.cards.Card;
import com.rich.projetcd.cards.actions.Action;
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

    private String name;
    private int points = 0;
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

    public void generateInitialDeck() {deck.generateInitialDeck(this);}

    public void generateHand() {
        hand.generateHand();
    }

    public void setTurn(Turn t) {
        this.turn = t;
    }

    public Turn getTurn() {
        return this.turn;
    }


    public void drawCards(int draws) {

        hand.drawCards(draws);
    }

    public void playTreasure(Card c) {
        if (c.isTreasure()) {
            c.play(this.turn);
            Log.i(TAG, "+++++ played " + c.getCardName());
        } else {
            Log.i(TAG, "---Card is not a treasure!");
        }
    }

    public void chooseAction() {

        int actionCounter = 0;
        ArrayList<Card> actions = new ArrayList<>();
        System.out.println("Select an action card to play:");

        for(Card c : hand.cards) {
            if(c instanceof Action) {
                actionCounter++;
                actions.add(c);
                System.out.println(actionCounter + " : " + c.getCardName());
            }
        }
        actions.get(actionCounter - 1).play(this.turn);

    }
}
