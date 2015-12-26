package com.rich.projetcd;

import junit.framework.TestCase;

/**
 * Created by rich on 06/12/15.
 */
public class KingdomTest extends TestCase {


    public GameManager gameManager = new GameManager();
    public Kingdom kd = new Kingdom(gameManager);
    public Player player1 = new Player();
    public Player player2  = new Player();

    public void testAddingPlayers() {

        //Add players to the Kingdom. Generate initial ownedCards. Shuffle ownedCards.

        final String TAG = "TestAddingPlayers";

        gameManager.addPlayer(player1);
        gameManager.addPlayer(player2);
        player1.deck.generateInitialDeck(player1);
        player2.deck.generateInitialDeck(player2);

        player1.setName("Player 1");
        player2.setName("Player 2");

        assertTrue(gameManager.getPlayerCount() == 2);
        assertTrue(gameManager.getPlayerAtIndex(0).equals(player1));
        assertTrue(gameManager.getPlayerAtIndex(1).getName().equals("Player 2"));
        assertTrue(gameManager.getPlayerAtIndex(1).ownedCards.cards.size() == 10);
        assertTrue(gameManager.getPlayerAtIndex(0).ownedCards.cards.size() == 10);
    }

    public void testAddingFixedKingdomCards() {

        final String TAG = "TestAddingFixedKingdomCards";

        gameManager.addPlayer(player1);
        gameManager.addPlayer(player2);

        int sizeOfVictoryPiles = (gameManager.getPlayerCount() > 2) ? 12 : 8;

        kd.generateFixedSetup();
        assertTrue(kd.getPiles().size() == 6);
        assertTrue(kd.getPiles().get("Copper").getPileSize() == 60);
        assertTrue(kd.getPiles().get("Estate").getPileSize() == sizeOfVictoryPiles);
        assertTrue(kd.getPiles().get("Estate").getPileSize() == 8);
    }

    public void testDeckManipulations() {

        final String TAG = "testDeckManipulations";

        player1.generateInitialDeck();
        player2.generateInitialDeck();
        player1.generateHand();
        Turn testTurn = new Turn(player1);
        player1.setTurn(testTurn);

        assertEquals(player1.deck.size(), 5);
        assertEquals(player1.hand.size(), 5);

        player1.drawCards(2);
        assertEquals(player1.hand.size(), 7);
        assertEquals(player1.deck.size(), 3);
        player1.drawCards(2);
        assertEquals(player1.hand.size(), 9);
        assertEquals(player1.deck.size(), 1);

        testTurn.cleanUp();
        assertEquals(player1.hand.size(), 0);
        assertEquals(player1.deck.size(), 1);
        assertEquals(player1.discardPile.size(), 9);

        player1.drawCards(1);
        assertEquals(player1.hand.size(), 1);
        assertEquals(player1.deck.size(), 0);
        assertEquals(player1.discardPile.size(), 9);

        player1.drawCards(2);
        assertEquals(player1.hand.size(), 3);
        assertEquals(player1.deck.size(), 7);
        assertEquals(player1.discardPile.size(), 0);

        player1.playTreasure(player1.hand.cards.get(1));
        player1.playTreasure(player1.hand.cards.get(0));
        player1.playTreasure(player1.hand.cards.get(2));
    }

}
