package com.rich.projetcd;

import android.util.Log;

import com.rich.projetcd.cards.Card;
import com.rich.projetcd.cards.treasures.Copper;
import com.rich.projetcd.cards.victories.Estate;

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

    public void generateInitialDeck(Player player) {

        for (int i = 0; i < 7; i++) {
            Copper copper = new Copper();
            addCardToTopOfDeck(copper);
            player.ownedCards.addCardtoOwnedCards(copper);
        }
        for (int i = 0; i < 3; i++) {
            Estate estate = new Estate();
            addCardToTopOfDeck(estate);
            player.ownedCards.addCardtoOwnedCards(estate);
        }

        shuffle();
    }
}

