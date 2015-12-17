package com.rich.projetcd;

import android.util.Log;

import com.rich.projetcd.cards.Card;
import com.rich.projetcd.cards.treasures.Treasure;

/**
 * Created by Rich on 2015-11-13.
 */
public class Turn {

    Player player;
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

        playActions();
        playTreasures();
        buyPhase();
    }

    private void buyPhase() {
        Log.i("BUY PHASE", "");
    }

    private void playActions() {
        while(actions > 0) {
            player.chooseAction();
        }
    }

    private void playTreasures() {
        for(Card c : player.hand.getHandCards()) {
            c.play(this);
        }
    }


}
