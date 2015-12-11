package com.rich.projetcd;

import junit.framework.TestCase;

/**
 * Created by rich on 06/12/15.
 */
public class KingdomTest extends TestCase {

    public Kingdom kd = new Kingdom();
    Player player1 = new Player();
    Player player2  = new Player();

    public void testAddingPlayers() {

        //Add players to the Kingdom. Generate initial ownedCards. Shuffle ownedCards.

        final String TAG = "TestAddingPlayers";

        kd.addPlayer(player1);
        kd.addPlayer(player2);
        player1.deck.generateInitialDeck(player1);
        player2.deck.generateInitialDeck(player2);

        player1.setName("Player 1");
        player2.setName("Player 2");

        assertTrue(kd.getPlayers().size() == 2);
        assertTrue(kd.getPlayerAtIndex(0).equals(player1));
        assertTrue(kd.getPlayerAtIndex(1).getName().equals("Player 2"));
        assertTrue(kd.getPlayerAtIndex(1).ownedCards.cards.size() == 10);
        assertTrue(kd.getPlayerAtIndex(0).ownedCards.cards.size() == 10);


    }


    public void testAddingFixedKingdomCards() {

        final String TAG = "TestAddingFixedKingdomCards";

        kd.addPlayer(player1);
        kd.addPlayer(player2);

        int sizeOfVictoryPiles = (kd.getPlayers().size() > 2) ? 12 : 8;

        kd.generateFixedSetup();
        assertTrue(kd.getPiles().size() == 6);
        assertTrue(kd.getPiles().get("Copper").getPileSize() == 60);
        assertTrue(kd.getPiles().get("Estate").getPileSize() == sizeOfVictoryPiles);

    }

    public void testDeckManipulations() {

        final String TAG = "testDeckManipulations";

        player1.generateInitialDeck();
        player2.generateInitialDeck();
        player1.generateHand();

        assertEquals(player1.deck.cards.size(), 5);
        assertEquals(player1.hand.size(), 5);


    }

}
