package com.rich.projetcd.cards.victories;

import android.util.Log;

import com.rich.projetcd.Player;
import com.rich.projetcd.Turn;

/**
 * Created by Rich on 2015-11-13.
 */
public class Duchy extends Victory {

    public Duchy() {
        super("Duchy", 5, "", Set.ALL);
    }

    @Override
    public void resolvePoints(Player player) {
        player.points += 3;

    }

    @Override
    public void addedToKingdom() {
        Log.i(" +++ new kingdom card", this.getCardName());
    }

    @Override
    public void play(Turn t) {
    }
}

