package com.rich.projetcd.cards.actions;

import com.rich.projetcd.Turn;
import com.rich.projetcd.cards.Card;

/**
 * Created by rich on 26/12/15.
 */
public class Smithy extends Action {

    public Smithy() {
        super("Smithy", 5, "+3 Cards", Set.BASE);
    }

    public void playAction(Turn turn) {
        turn.player.drawCards(3);
    }

    @Override
    public void addedToKingdom() {
    }
}

