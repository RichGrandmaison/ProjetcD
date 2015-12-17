package com.rich.projetcd.cards.treasures;

import com.rich.projetcd.Turn;
import com.rich.projetcd.cards.Card;

/**
 * Created by Rich on 2015-11-13.
 */
public abstract class Treasure extends Card {

    public int value;
    private Type type = Type.TREASURE;

    public Treasure(int value,String name, int cost, String text, Set set) {
        super(name, cost, text, set);
        this.value = value;
    }

    public abstract void playTreasure(Turn turn);

    public void play(Turn t) {
        playTreasure(t);
    }

}
