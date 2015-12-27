package com.rich.projetcd;

import android.util.Log;

import com.rich.projetcd.cards.Card;
import com.rich.projetcd.cards.actions.Action;
import com.rich.projetcd.cards.treasures.Treasure;

import java.util.ArrayList;

/**
 * Created by Rich on 2015-11-13.
 */
public class Turn {

    private static final String TAG = "TURN";

    public Player player;
    public int actions = 1;
    public int buys = 1;
    public int cash = 0;

    public Turn(Player player) {
        this.player = player;
        player.turn = this;
    }

    public void incrementActions(int i) {
        this.actions += i;
    }

    public void decrementActions(int i) { this.actions -=i ; }

    public void incrementBuys(int i) {
        this.buys += i;
    }

    public void decrementBuys(int i) {
        this.buys -= i;
    }


    public void playTurn() {
        playActions();
        playTreasures();
        buyPhase();
        cleanUp();
    }

    public void playActions() {

        while(player.hand.hasActionCard()) {

            ArrayList<Card> actionCards = new ArrayList<>();

            for(Card c : player.hand.cards) {
                if(c.isAction()) {
                    actionCards.add(c);
                }
            }

            int temp = 1;
            for(Card c : actionCards) {
                Log.i(TAG, "---->  " + temp++ + " : " + c.getCardName());
            }

            for(Card c : actionCards) {
                Log.i(TAG, "---->  playing " + c.getCardName());
                c.play(this);
            }
        }
    }

    public void playTreasures() {
        while(!player.hand.isEmpty()) {
            if (player.hand.cards.get(0).isTreasure()) {
                player.hand.cards.get(0).play(this);
            }
        }
    }

    public void buyPhase() {

        player.chooseBuys();
    }


    public void cleanUp() {
        player.playedCards.sendPileToDiscard();
        player.hand.sendPileToDiscard();
    }


}
