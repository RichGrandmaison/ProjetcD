package com.rich.projetcd.cards.victories;

import com.rich.projetcd.Player;
import com.rich.projetcd.cards.Card;

/**
 * Created by Rich on 2015-11-13.
 */
public abstract class Victory extends Card {

    private static Type type = Type.VICTORY;

    public Victory(String name, int cost, String text, Set set) {
        super(name, cost, text, set, type);
    }

    public abstract void resolvePoints(Player player);
}
