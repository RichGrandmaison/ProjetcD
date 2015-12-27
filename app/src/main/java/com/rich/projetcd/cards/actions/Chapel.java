package com.rich.projetcd.cards.actions;

import com.rich.projetcd.Turn;

/**
 * Created by rich on 26/12/15.
 */
public class Chapel extends Action {

    public Chapel() {
        super("Village", 2, "Trash up to 4 cards from your hand.", Set.BASE);
    }

    public void playAction(Turn turn) {

    }

    @Override
    public void addedToKingdom() {

    }

}