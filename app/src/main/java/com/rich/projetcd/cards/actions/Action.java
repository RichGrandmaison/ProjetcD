package com.rich.projetcd.cards.actions;

import com.rich.projetcd.Player;
import com.rich.projetcd.Turn;
import com.rich.projetcd.cards.Card;

/**
 * Created by Rich on 2015-11-13.
 */
public abstract class Action extends Card {


    private static Type type = Type.ACTION;

    public Action(String name, int cost, String text, Set set) {
        super(name, cost, text,set, type);
    }

    public void addedToDeck(Player player) {
        player.discardPile.addToPile(this);
    }

    @Override
    public void play(Turn t) {
        playAction(t);
        moveCardFromHandToPlayed(t);
        t.decrementActions(1);
    }

    public void playAction(Turn t) {

    }
}

