package com.rich.projetcd;

import com.rich.projetcd.cards.Card;

/**
 * Created by Rich on 2015-11-13.
 */
public class Pile {

    private Card pileCard;
    private int pileSize;

    Pile(Card card) {
        this.pileCard = card;
        int pileSize = 10;
    }

    Pile(Card card, int size) {
        this.pileCard = card;
        this.pileSize = size;
    }

    public int getPileSize() {
        return this.pileSize;
    }

    public void setPileSize(int size) {
        this.pileSize = size;
    }

    public void decreasePileSize() {
        this.pileSize -= 1;
    }

    public void increasePileSize() {
        this.pileSize += 1;
    }

}
