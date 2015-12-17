package com.rich.projetcd;

import com.rich.projetcd.cards.Card;
import com.rich.projetcd.cards.actions.*;
import com.rich.projetcd.cards.victories.*;
import com.rich.projetcd.cards.treasures.*;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/**
 * Created by Rich on 2015-11-13.
 */
public class Kingdom {

    private LinkedHashMap<String, Pile> piles;
    private GameManager gm;
    private ArrayList<Card> trash;
    private int playerCount = 0;


    public Kingdom(GameManager gm) {
        this.gm = gm;
        piles = new LinkedHashMap<>();
        trash = new ArrayList<>();
        gm.addKingdom(this);
    }

    public void setPlayerCount(int playerCount) {
        this.playerCount = playerCount;
    }

    public int getPlayerCount() {
        return playerCount;
    }

    public void addPile(Pile addedPile) {
        this.piles.put(addedPile.getPileCardName(), addedPile);
        addedPile.setIndex(piles.size());

    }

    public void addTrash(Card trashedCard) {
        this.trash.add(trashedCard);
    }

    public ArrayList<Card> getTrash() {
        return trash;
    }

    public LinkedHashMap<String, Pile> getPiles() {
        return piles;
    }

    public void generateFixedSetup() {

        addPile(new Pile( new Copper(), 60));
        addPile(new Pile( new Silver(), 40));
        addPile(new Pile( new Gold(), 30));

        int sizeOfVictoryPiles = (gm.getPlayerCount() > 2) ? 12 : 8;

        addPile(new Pile( new Estate(), sizeOfVictoryPiles));
        addPile(new Pile( new Duchy(), sizeOfVictoryPiles));
        addPile(new Pile( new Province(), sizeOfVictoryPiles));

        for(Pile pile : piles.values()) pile.addedToKingtom();

    }

    private void generateVariableCards() {

    }


}
