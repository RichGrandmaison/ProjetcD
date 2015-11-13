package com.rich.projetcd.cards.treasures;

import com.rich.projetcd.Turn;
import com.rich.projetcd.cards.Card;

/**
 * Created by Rich on 2015-11-13.
 */
public abstract class Treasure extends Card {

    public int value;

    public Treasure(int value,String name, int cost, String text, Set set, Type type) {
        super(name, cost, text, set, type);
        this.value = value;
    }

    public abstract void playTreasure(Turn turn);

}
