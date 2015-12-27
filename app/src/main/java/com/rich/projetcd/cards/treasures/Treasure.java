package com.rich.projetcd.cards.treasures;

import com.rich.projetcd.Player;
import com.rich.projetcd.Turn;
import com.rich.projetcd.cards.Card;

/**
 * Created by Rich on 2015-11-13.
 */
public abstract class Treasure extends Card {

    private static Type type = Type.TREASURE;
    public int value;


    public Treasure(int value,String name, int cost, String text, Set set) {
        super(name, cost, text, set, type);
        this.value = value;
    }

    public void addedToDeck(Player player) {
        player.discardPile.addToPile(this);
    }

    public abstract void playTreasure(Turn turn);

    public void play(Turn t) {
        playTreasure(t);
        moveCardFromHandToPlayed(t);
    }

}
