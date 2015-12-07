package com.rich.projetcd.cards.treasures;

import com.rich.projetcd.Turn;

/**
 * Created by Rich on 2015-11-13.
 */
public class Gold extends Treasure {

    public Gold() {
        super(3, "Gold", 6, "", Set.ALL, Type.TREASURE);
    }

    @Override
    public void addedToDeck() {
    }

    @Override
    public void addedToKingdom() {
    }

    @Override
    public void playTreasure(Turn turn) {
        turn.cash += this.value;
    }
}
