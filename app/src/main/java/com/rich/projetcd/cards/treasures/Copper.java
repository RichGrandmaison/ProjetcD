package com.rich.projetcd.cards.treasures;

import com.rich.projetcd.Turn;
import android.util.Log;

/**
 * Created by Rich on 2015-11-13.
 */
public class Copper extends Treasure {

    public Copper() {
        super(1, "Copper", 0, "", Set.ALL);
    }

    @Override
    public void addedToKingdom() {
    }

    @Override
    public void playTreasure(Turn turn) {
        turn.cash += this.value;
        Log.i("++Treasure played: ", this.getCardName() + " (" + turn.cash + ").");
    }
}
