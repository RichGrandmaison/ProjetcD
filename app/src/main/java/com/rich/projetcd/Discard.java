package com.rich.projetcd;

import android.util.Log;

import com.rich.projetcd.cards.Card;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Rich on 2015-11-13.
 */
public class Discard extends PlayerPile {

    private static final String TAG = "++DISCARD:";

    public Discard(Player player) {
        super(player);
    }

    public void addToDiscardPile(Card c) {
        addToPile(c);
    }

    //TODO cest laid
    public ArrayList<Card> shuffleAndMakeDeck() {

        ArrayList<Card> newDeck = new ArrayList<>();
        Collections.shuffle(cards);
        newDeck.addAll(cards);
        cards.clear();
        Log.i(TAG, "Shuffling a new deck!");
        return newDeck;
    }

}
