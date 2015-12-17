package com.rich.projetcd.cards.victories;

import com.rich.projetcd.Player;
import com.rich.projetcd.Turn;

/**
 * Created by Rich on 2015-11-13.
 */
public class Province extends Victory {

    public Province() {
        super("Province", 8, "", Set.ALL);
    }
    @Override
    public void resolvePoints(Player player) {
        player.setPoints(player.getPoints() + 6);

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
