package com.rich.projetcd;

import com.rich.projetcd.behaviors.AIBehavior;

import java.util.ArrayList;

/**
 * Created by rich on 26/12/15.
 */
public class AI extends Player {

    public String name;
    public int points = 0;
    public OwnedCards ownedCards; //all your cards
    public Discard discardPile; //cards in the discard pile
    public Played playedCards; //cards discarded this turn, but not yet in the Discard pile.
    public Deck deck; //cards from which you draw
    public Hand hand; //cards in your hand
    public Turn turn; //TODO

    public ArrayList<AIBehavior> behaviors = new ArrayList<>();

    public AI() {
        super();
    }

    public void addBehavior(AIBehavior aib) {
        behaviors.add(aib);
    }
}
