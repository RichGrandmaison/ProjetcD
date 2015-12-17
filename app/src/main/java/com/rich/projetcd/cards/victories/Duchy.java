package com.rich.projetcd.cards.victories;

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
        player.setPoints(player.getPoints() + 3);

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

