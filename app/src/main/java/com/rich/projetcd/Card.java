package com.rich.projetcd;

/**
 * Created by Rich on 2015-11-13.
 */
public abstract class Card {

    private String cardName;
    private String cardText;
    private int cardCost;
    private Set cardSet;

    public Card() {
    }

    public Card(String name, int cost, String text, Set set) {
        this.cardName = name;
        this.cardCost = cost;
        this.cardText = text;
        this.cardSet = set;
    }

    public String getCardName() {
        return this.cardName;
    }

    public String getCardText() {
        return this.cardText;
    }

    public int getCardCost() {
        return cardCost;
    }

    public Set getCardSet() {
        return cardSet;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public void setCardText(String cardText) {
        this.cardText = cardText;
    }

    public void setCardCost(int cardCost) {
        this.cardCost = cardCost;
    }

    public void setCardSet(Set cardSet) {
        this.cardSet = cardSet;
    }

    public abstract void addedToDeck();
    public abstract void addedToKingdom();

    public enum Set {
        ALL, BASE, SEASIDE, INTRIGUE, DARK_AGES, GUILDS, ALCHEMY, PROSPERITY, ADVENTURES, HINTERLANDS, CORNUCOPIA, PROMO
    }
}
