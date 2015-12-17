package com.rich.projetcd.cards.treasures;

import com.rich.projetcd.Turn;

/**
 * Created by Rich on 2015-11-13.
 */
public class Silver extends Treasure {

    public Silver() {
        super(2, "Silver", 3, "", Set.ALL);
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
