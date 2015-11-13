package com.rich.projetcd.cards.victories;

import com.rich.projetcd.Player;

/**
 * Created by Rich on 2015-11-13.
 */
public class Colony extends Victory {

    public Colony(String name, int cost, String text, Set set, Type type) {
        super("Colony", 11, "", Set.ALL, Type.VICTORY);
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
}
