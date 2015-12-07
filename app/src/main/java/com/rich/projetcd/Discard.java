package com.rich.projetcd;

import com.rich.projetcd.cards.Card;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Rich on 2015-11-13.
 */
public class Discard {

    ArrayList<Card> discards;


    public Discard() {

        discards = new ArrayList<>();
    }

    public boolean isEmpty() {
        return discards.isEmpty();
    }

    public ArrayList<Card> shuffleAndMakeDeck() {

        ArrayList<Card> newDeck = new ArrayList<>();
        Collections.shuffle(this.discards);
        newDeck.addAll(discards);
        discards.clear();
        return newDeck;

    }

}
