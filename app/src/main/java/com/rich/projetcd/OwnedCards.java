package com.rich.projetcd;

import com.rich.projetcd.cards.Card;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Rich on 2015-11-13.
 * Represents all the cards in your control.
 *  OwnedCards = Deck + Hand + Played + Discard + Mats
 */
public class OwnedCards {

    public ArrayList<Card> cards = new ArrayList<>();

    public OwnedCards() {
    }

    public void addCardtoOwnedCards(Card card) {
        cards.add(card);
        card.addedToDeck();
    }

    public void removeCardFromOwnedCards(Card card) {
        cards.remove(card);
    }

    public void shuffle() {

        Collections.shuffle(this.cards);

    }




}
