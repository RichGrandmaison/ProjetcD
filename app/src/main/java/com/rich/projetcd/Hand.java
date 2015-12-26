package com.rich.projetcd;

import android.util.Log;

import com.rich.projetcd.cards.Card;
import com.rich.projetcd.cards.actions.Action;

import java.util.ArrayList;

/**
 * Created by Rich on 2015-11-13.
 */
public class Hand extends PlayerPile {

    private static final String TAG = "++HAND:";

    public Hand(Player player) {
        super(player);
    }


    public void addToHand(Card c) {
        addToPile(c);
        Log.i(TAG, "added " + c.getCardName() + " to hand.");
    }

    public void removeFromHand(Card c) {
        removeFromPile(c);
    }

    public void generateHand() {
        while(cards.size() < 5) {
               player.drawCards(1);
        }
    }

    public void drawCards(int draws) {
        for(int i = 0; i < draws; i++) {
            if(!player.deck.isEmpty()) {
                addToHand(player.deck.drawTopCard());
            }
            else {
                player.deck.cards = player.discardPile.shuffleAndMakeDeck();
                addToHand(player.deck.drawTopCard());
            }
        }
    }

    public boolean hasActionCard() {
        for(Card c : cards) {
            if(c instanceof Action) {
                return true;
            }
        }
        return false;
    }
}
