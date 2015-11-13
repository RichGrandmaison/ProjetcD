package com.rich.projetcd.cards.Treasures;

import com.rich.projetcd.Card;
import com.rich.projetcd.Turn;

/**
 * Created by Rich on 2015-11-13.
 */
public abstract class Treasure extends Card {

    public int value;

    public Treasure(int value,String name, int cost, String text, Set set) {
        super(name, cost, text, set);
        this.value = value;
    }

    public abstract void playTreasure(Turn turn);

}
