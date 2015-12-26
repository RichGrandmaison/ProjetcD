package com.rich.projetcd;

import com.rich.projetcd.cards.actions.Village;

import junit.framework.TestCase;

/**
 * Created by rich on 17/12/15.
 */
public class GameManagerTest extends TestCase {

    public void testGeneratingGameComponents() {
       GameManager gm = new GameManager();

       gm.generatePlayers(3);
       gm.generateKingdom();

       assertEquals(gm.getKingdom().getPiles().size(), 6);
       assertEquals(gm.getKingdom().getPiles().get("Copper").getPileSize(), 60);
       assertEquals(gm.getKingdom().getPiles().get("Duchy").getPileSize(), 12);
    }

    public void testTurn() {
        GameManager gm = new GameManager();

        gm.generatePlayers(1);
        gm.generateKingdom();
        Turn testTurn = new Turn(gm.getPlayerAtIndex(0));
        Player testPlayer = gm.getPlayerAtIndex(0);
        testPlayer.setTurn(testTurn);

        testPlayer.deck.addCardToTopOfDeck(new Village());
        testPlayer.deck.lookAtTopOfDeck();
        testPlayer.generateHand();
        testPlayer.deck.lookAtTopOfDeck();

        assertEquals(testPlayer.deck.cards.size(), 6);
        assertEquals(testPlayer.hand.size(), 5);

        testTurn.playTurn();



    }

}
