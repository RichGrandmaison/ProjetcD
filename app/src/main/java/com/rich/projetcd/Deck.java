package com.rich.projetcd;

import com.rich.projetcd.cards.Card;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Rich on 2015-11-13.
 * Represents all the cards in your control.
 *  Deck = Playable + Hand + Played + Discard + Mats
 */
public class Deck {

    public ArrayList<Card> cards = new ArrayList<>();

    public Deck() {
    }

    public void shuffle() {
        Collections.shuffle(this.cards);
    }

    public void addCardtoDeck(Card card) {
        cards.add(card);
        card.addedToDeck();
    }


}
