package com.rich.projetcd;

import android.util.Log;

import com.rich.projetcd.cards.Card;
import com.rich.projetcd.cards.actions.Action;
import com.rich.projetcd.cards.actions.Smithy;
import com.rich.projetcd.cards.actions.Village;
import com.rich.projetcd.cards.treasures.Copper;
import com.rich.projetcd.cards.treasures.Silver;
import com.rich.projetcd.cards.victories.Duchy;
import com.rich.projetcd.cards.victories.Estate;

import junit.framework.TestCase;

/**
 * Created by rich on 26/12/15.
 */
public class TurnTest extends TestCase {

    Player player = new Player();
    Turn turn = new Turn(player);

    public void setUp() throws Exception {

        player.generateInitialDeck();
        assertEquals(player.deck.size(), 10);

    }

    public void tearDown() throws Exception {

    }

    public void testIncrementActions() throws Exception {

        assertEquals(turn.actions, 1);
        turn.incrementActions(2);
        assertEquals(turn.actions, 3);

    }

    public void testDecrementActions() throws Exception {

        assertEquals(turn.actions, 1);
        turn.decrementActions(1);
        assertEquals(turn.actions,0);

    }

    public void testIncrementBuys() throws Exception {

        assertEquals(turn.buys,1);
        turn.incrementBuys(2);
        assertEquals(turn.buys, 3);

    }

    public void testDecrementBuys() throws Exception {
        assertEquals(turn.buys, 1);
        turn.decrementBuys(1);
        assertEquals(turn.buys, 0);

    }

    public void testPlayTurn() throws Exception {


        player.hand.addToPile(new Smithy());
        player.deck.addToPile(new Copper());
        player.deck.addToPile(new Copper());
        player.deck.addToPile(new Copper());

        turn.playTurn();
    }

    public void testPlayAction() throws Exception {

        player.deck.addToPile(new Duchy());
        player.deck.addToPile(new Silver());
        player.deck.addToPile(new Estate());
        player.deck.addToPile(new Copper());
        player.deck.addToPile(new Smithy());
        player.hand.addToPile(new Village());

        turn.player.playAction(player.hand.cards.get(0));

        assertEquals(player.hand.size(), 1);
        assertEquals(turn.buys, 1);
        assertEquals(turn.actions, 2);

        turn.player.playAction(player.hand.cards.get(0));

        assertEquals(player.hand.size(), 3);
        assertEquals(turn.buys, 1);
        assertEquals(turn.actions, 1);

    }

    public void testPlayActions() throws Exception {

        player.deck.addToPile(new Duchy());
        player.deck.addToPile(new Silver());
        player.deck.addToPile(new Estate());
        player.deck.addToPile(new Copper());
        player.deck.addToPile(new Smithy());
        player.hand.addToPile(new Village());

        assertTrue(player.deck.lookAtTopOfDeck() instanceof Action);
        assertEquals(player.hand.size(), 1);

        turn.playActions();

        assertEquals(player.hand.size(), 3);
        assertEquals(turn.buys, 1);
        assertEquals(turn.actions, 1);

    }

    public void testPlayTreasures() throws Exception {

        player.hand.addToPile(new Copper());
        player.hand.addToPile(new Copper());
        player.hand.addToPile(new Copper());
        player.hand.addToPile(new Copper());
        player.hand.addToPile(new Copper());

        assertEquals(player.playedCards.size(), 0);
        assertEquals(player.hand.size(), 5);

        player.playTreasure(player.hand.cards.get(4));

        assertEquals(player.playedCards.size(), 1);
        assertEquals(player.hand.size(), 4);
        assertEquals(turn.cash, 1);

        turn.playTreasures();

        assertEquals(turn.cash, 5);
        assertEquals(player.hand.size(), 0);
        assertEquals(player.playedCards.size(),5);

    }

    public void testBuyPhase() throws Exception {

        player.hand.addToPile(new Copper());
        player.hand.addToPile(new Copper());
        player.hand.addToPile(new Copper());
        player.hand.addToPile(new Copper());
        player.hand.addToPile(new Copper());

        turn.playTreasures();

        assertEquals(turn.cash, 5);
        assertEquals(player.hand.size(), 0);
        assertEquals(player.playedCards.size(), 5);

       turn.buyPhase();

        assertEquals(player.discardPile.size(), 1);
        assertEquals(player.discardPile.cards.get(0).getClass(), new Silver().getClass());
        assertEquals(turn.buys, 0);
        assertEquals(turn.cash, 2);

    }

    public void testCleanUp() throws Exception {

        player.playedCards.addToPile(new Copper());
        player.playedCards.addToPile(new Copper());
        player.hand.addToPile(new Copper());
        player.hand.addToPile(new Copper());
        player.hand.addToPile(new Copper());

        turn.cleanUp();

        assertEquals(player.discardPile.size(), 5);
        assertEquals(player.playedCards.size(), 0);
        assertEquals(player.hand.size(), 0);
    }
}