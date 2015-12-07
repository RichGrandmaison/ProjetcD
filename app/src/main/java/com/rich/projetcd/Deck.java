package com.rich.projetcd;

import android.util.Log;

import com.rich.projetcd.cards.Card;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Rich on 2015-11-13.
 *
 */
public class Deck {

    private static final String TAG = "++DECK:";

    public ArrayList<Card> cards;

    public Deck() {
        this.cards = new ArrayList<>();
    }

    public boolean isEmpty() {
        return this.cards.isEmpty();
    }

    public void addCardToTopOfDeck(Card c) {
        cards.add(c);
        Log.i(TAG, "added " + c.getCardName() + " to top of deck.");
    }

    public Card drawTopCard() {
        Card top = cards.get(cards.size() - 1);
        cards.remove(top);
        Log.i(TAG, "drew " + top.getCardName() + " from top of deck.");
        return top;
    }

    public void shuffle() {
        Collections.shuffle(this.cards);
    }

}

