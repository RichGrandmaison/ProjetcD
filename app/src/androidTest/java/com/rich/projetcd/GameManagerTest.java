package com.rich.projetcd;

import junit.framework.TestCase;

/**
 * Created by rich on 17/12/15.
 */
public class GameManagerTest extends TestCase {

   public void testGeneratingGameComponents() {
       GameManager gm = new GameManager();
       gm.generateKingdom();
       gm.generatePlayers(3);

       assertEquals(gm.getKingdom().getPiles().size(), 6);
       assertEquals(gm.getKingdom().getPiles().get("Copper").getPileSize(), 60);

    }
}
