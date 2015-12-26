package com.rich.projetcd.cards.actions;

import com.rich.projetcd.Turn;

/**
 * Created by Rich on 2015-11-13.
 */
public class Village extends Action {

    public Village() {
        super("Village", 3, "+1 Card\r\n+2 Action", Set.BASE);
    }
    @Override
    public void playAction(Turn turn) {

        turn.player.drawCards(1);
        turn.incrementActions(2);
        turn.player.playedCards.addToPile(this);
        turn.player.hand.removeFromPile(this);
    }

    @Override
    public void addedToDeck() {

    }

    @Override
    public void addedToKingdom() {

    }

    @Override
    public void play(Turn t) {
        playAction(t);
    }
}
