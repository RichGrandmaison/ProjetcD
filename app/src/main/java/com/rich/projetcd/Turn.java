package com.rich.projetcd;

/**
 * Created by Rich on 2015-11-13.
 */
public class Turn {

    Player player;
    private int actions = 1;
    private int buys = 1;
    private int cash = 0;

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


}
