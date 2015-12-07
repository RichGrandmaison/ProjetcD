package com.rich.projetcd;

import android.util.Log;

import com.rich.projetcd.cards.Card;

import java.util.ArrayList;

/**
 * Created by Rich on 2015-11-13.
 */
public class Hand {

    private static final String TAG = "++HAND:";

    private ArrayList<Card> cards;

    public Hand() {

        cards = new ArrayList<>();
    }

    public void drawCardsFromDeck(int x) {

    }

    public int size() {
        return cards.size();
    }

    public void addToHand(Card c) {
        cards.add(c);
        Log.i(TAG, "added " + c.getCardName() + " to hand.");
    }

    public void removeFromHand(Card c) {
        cards.remove(c);
    }

    public void generateHand(Player player) {
        while(cards.size() < 5) {
            if(!player.deck.isEmpty()) {

            }
        }
    }

}
