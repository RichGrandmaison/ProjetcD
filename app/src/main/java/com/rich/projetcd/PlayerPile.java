package com.rich.projetcd;

import com.rich.projetcd.Player;
import com.rich.projetcd.cards.Card;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by rich on 25/12/15.
 */
public abstract class PlayerPile {

        public ArrayList<Card> cards = new ArrayList<>();
        public Player player;

    public PlayerPile(Player player) {
        this.player = player;
        this.cards = new ArrayList<>();
    }


    public void addToPile(Card c) {
        cards.add(c);
    }

    public void removeFromPile(Card c) {
        cards.remove(c);
    }

    public boolean isEmpty() {
        return cards.size() == 0;
    }

    public int size() {
        return cards.size();
    }

    public void shuffle() {
        Collections.shuffle(this.cards);
    }

    public void sendPileToDeck() {
        for(Card c : cards) {
            this.player.deck.addToPile(c);
        }
        cards.clear();
    }

    public void sendPileToDiscard() {
        for (Card c : cards) {
            this.player.discardPile.addToPile(c);
        }
        cards.clear();
    }
}
