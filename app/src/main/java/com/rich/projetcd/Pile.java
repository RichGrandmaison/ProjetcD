package com.rich.projetcd;

import com.rich.projetcd.cards.Card;

/**
 * Created by Rich on 2015-11-13.
 */
public class Pile<T> {


    private Card pileCard;
    private int pileSize;
    private int pileIndex;

    Pile() {
    }

    public Pile(Card pileCard, int pileSize) {
        this.pileCard = pileCard;
        this.pileSize = pileSize;
    }

    private void setPileCard(Card card) { this.pileCard = card; }

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

    public int getIndex() {return pileIndex;}

    public void setIndex(int index) { this.pileIndex = index;}

    public Card getPileCard() {
        return pileCard;
    }

    public String getPileCardName() {
        return pileCard.getCardName();
    }

    public void addedToKingdom() {
        this.pileCard.addedToKingdom();
    }
}
