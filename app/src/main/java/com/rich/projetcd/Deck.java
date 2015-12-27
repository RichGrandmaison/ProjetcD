package com.rich.projetcd;

import android.util.Log;

import com.rich.projetcd.cards.Card;
import com.rich.projetcd.cards.treasures.Copper;
import com.rich.projetcd.cards.victories.Estate;

/**
 * Created by Rich on 2015-11-13.
 *
 */
public class Deck extends PlayerPile {

    private static final String TAG = "++DECK:";

    public Deck(Player player) {
        super(player);
    }

    public void addCardToTopOfDeck(Card c) {
        this.addToPile(c);
    }

    public Card lookAtTopOfDeck() { //TODO trop vedge mais check pour out of bound
        return cards.get(cards.size() - 1);
    }

    public Card drawTopCard() {
        if (this.isEmpty()) {
            player.discardPile.sendPileToDeck();
            player.playedCards.sendPileToDeck();
        }
            Card top = cards.get(cards.size() - 1);
            removeFromPile(top);
            return top;
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

