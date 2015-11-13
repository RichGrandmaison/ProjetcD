package com.rich.projetcd.cards.victories;

import com.rich.projetcd.Player;

/**
 * Created by Rich on 2015-11-13.
 */
public class Province extends Victory {

    public Province(String name, int cost, String text, Set set, Type type) {
        super("Province", 8, "", Set.ALL, Type.VICTORY);
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
}
