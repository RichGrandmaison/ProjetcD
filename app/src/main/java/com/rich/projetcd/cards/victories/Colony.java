package com.rich.projetcd.cards.victories;

import com.rich.projetcd.Player;
import com.rich.projetcd.Turn;

/**
 * Created by Rich on 2015-11-13.
 */
public class Colony extends Victory {

    public Colony() {
        super("Colony", 11, "", Set.ALL);
    }

    @Override
    public void resolvePoints(Player player) {
        player.setPoints(player.getPoints() + 10);

    }

    @Override
    public void addedToDeck() {
    }

    @Override
    public void addedToKingdom() {
    }

    @Override
    public void play(Turn t) {
    }
}
