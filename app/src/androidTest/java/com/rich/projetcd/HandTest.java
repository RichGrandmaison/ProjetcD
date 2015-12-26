package com.rich.projetcd;

import com.rich.projetcd.cards.actions.Village;
import com.rich.projetcd.cards.treasures.Copper;
import com.rich.projetcd.cards.victories.Estate;

import junit.framework.TestCase;

/**
 * Created by rich on 26/12/15.
 */
public class HandTest extends TestCase {

    Player player1 = new Player();
    Hand testHand = new Hand(player1);

    public void testAddRemove() {

        Estate estate = new Estate();

        testHand.addToPile(estate);
        assertEquals(testHand.size(), 1);
        testHand.removeFromPile(estate);
        assertEquals(testHand.size(), 0);

    }

    public void testDrawCards() {

        Estate estate = new Estate();
        Copper copper = new Copper();
        Village village = new Village();

        player1.deck.addToPile(estate);
        player1.deck.addToPile(copper);
        player1.deck.addToPile(village);

        assertEquals(player1.hand.size(), 0);
        assertEquals(player1.deck.size(), 3);

        player1.drawCards(2);

        assertEquals(player1.hand.size(), 2);
        assertEquals(player1.deck.size(), 1);

    }

    public void testGenerateHand() {

        Estate estate = new Estate();
        Copper copper = new Copper();
        Village village = new Village();

        player1.deck.addToPile(estate);
        player1.deck.addToPile(copper);
        player1.deck.addToPile(copper);
        player1.deck.addToPile(copper);
        player1.deck.addToPile(village);

        player1.generateHand();

        assertEquals(player1.hand.size(), 5);

    }

    public void testGenerateHandFromSmallDeck() {
        Estate estate = new Estate();
        Copper copper = new Copper();
        Village village = new Village();

        player1.deck.addToPile(estate);
        player1.discardPile.addToPile(copper);
        player1.discardPile.addToPile(copper);
        player1.discardPile.addToPile(copper);
        player1.discardPile.addToPile(village);

        assertEquals(player1.hand.size(), 0);
        assertEquals(player1.deck.size(), 1);
        assertEquals(player1.discardPile.size(), 4);

        player1.generateHand();

        assertEquals(player1.hand.size(), 5);
        assertEquals(player1.deck.size(), 0);
        assertEquals(player1.discardPile.size(), 0);

    }

    public void testDrawCardsFromSmallDeck() {
        Estate estate = new Estate();
        Copper copper = new Copper();
        Village village = new Village();

        player1.deck.addToPile(estate);
        player1.discardPile.addToPile(copper);
        player1.discardPile.addToPile(copper);
        player1.discardPile.addToPile(copper);
        player1.discardPile.addToPile(village);

        assertEquals(player1.hand.size(), 0);
        assertEquals(player1.deck.size(), 1);
        assertEquals(player1.discardPile.size(), 4);

        player1.drawCards(2);

        assertEquals(player1.hand.size(), 2);
        assertEquals(player1.deck.size(), 3);
        assertEquals(player1.discardPile.size(), 0);


    }


}
