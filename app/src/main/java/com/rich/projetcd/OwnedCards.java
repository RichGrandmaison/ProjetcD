package com.rich.projetcd;

import com.rich.projetcd.cards.Card;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Rich on 2015-11-13.
 * Represents all the cards in your control.
 *  OwnedCards = Deck + Hand + Played + Discard + Mats
 */
public class OwnedCards extends PlayerPile {

    public OwnedCards(Player p) {
        super(p);
    }

    public void addCardtoOwnedCards(Card c) {
        addToPile(c);
    }

    public void removeCardFromOwnedCards(Card c) {
        removeFromPile(c);
    }

}
