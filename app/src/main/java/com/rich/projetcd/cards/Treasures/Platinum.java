package com.rich.projetcd.cards.Treasures;

import com.rich.projetcd.Turn;

/**
 * Created by Rich on 2015-11-13.
 */
public class Platinum extends Treasure {

    public Platinum() {
        super(5, "Platinum", 0, "", Set.PROSPERITY);
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
