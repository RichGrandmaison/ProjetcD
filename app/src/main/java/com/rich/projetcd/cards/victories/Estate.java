package com.rich.projetcd.cards.victories;

import com.rich.projetcd.Player;

/**
 * Created by Rich on 2015-11-13.
 */
public class Estate extends Victory {

    public Estate() {
        super("Estate", 2, "", Set.ALL, Type.VICTORY);
    }
    @Override
    public void resolvePoints(Player player) {
        player.setPoints(player.getPoints() + 1);

    }

    @Override
    public void addedToDeck() {
    }

    @Override
    public void addedToKingdom() {

    }
}
