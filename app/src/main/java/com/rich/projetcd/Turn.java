package com.rich.projetcd;

import android.util.Log;

import com.rich.projetcd.cards.Card;
import com.rich.projetcd.cards.treasures.Treasure;

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
    }

    public void incrementActions(int i) {
        this.actions += 1;
    }

    public void decrementActions(int i) {
        this.actions -=1 ;
    }

    public void incrementBuys(int i) {
        this.buys += 1;
    }

    public void decrementBuys(int i) {
        this.buys -= 1;
    }


    public void playTurn() {
        Log.i(TAG, "starting a turn");
        playActions();
        playTreasures();
        buyPhase();
    }

    private void buyPhase() {
        Log.i(TAG, "buy phase");
    }

    private void playActions() {
        Log.i(TAG, "action phase");
        while(actions > 0 && player.hand.hasActionCard()) {
            player.chooseAction();
            decrementActions(1);
        }
    }

    private void playTreasures() {
        Log.i(TAG, "treasure phase");
        for(Card c : player.hand.getHandCards()) {
            c.play(this);
        }
    }


}
