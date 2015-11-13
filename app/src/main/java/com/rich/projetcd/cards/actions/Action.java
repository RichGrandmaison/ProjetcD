package com.rich.projetcd.cards.actions;

import com.rich.projetcd.Turn;
import com.rich.projetcd.cards.Card;

/**
 * Created by Rich on 2015-11-13.
 */
public abstract class Action extends Card {

    public Action(String name, int cost, String text, Set set, Type type) {
        super(name, cost, text,set, type);
    }

    public abstract void playAction(Turn turn);

}