package com.rich.projetcd;

import android.util.Log;

import com.rich.projetcd.cards.Card;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Rich on 2015-11-13.
 */
public class Discard {

    private static final String TAG = "++DISCARD:";

    ArrayList<Card> discards;


    public Discard() {

        discards = new ArrayList<>();
    }

    public boolean isEmpty() {
        return discards.isEmpty();
    }

    public void addToDiscardPile(Card c) {
        discards.add(c);
    }

    public ArrayList<Card> shuffleAndMakeDeck() {

        ArrayList<Card> newDeck = new ArrayList<>();
        Collections.shuffle(this.discards);
        newDeck.addAll(discards);
        discards.clear();
        Log.i(TAG, "Shuffling a new deck!");
        return newDeck;
    }

}
