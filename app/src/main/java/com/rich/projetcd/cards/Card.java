package com.rich.projetcd.cards;

import android.util.Log;

import com.rich.projetcd.Turn;
import com.rich.projetcd.cards.treasure_victory.TreasureVictory;
import com.rich.projetcd.cards.treasures.Treasure;

/**
 * Created by Rich on 2015-11-13.
 */
public abstract class Card {

    private static final String TAG = "CARD";

    private String cardName;
    private String cardText;
    private int cardCost;
    private Set cardSet;
    private Type cardType;

    public Card() {
    }

    public Card(String name, int cost, String text, Set set, Type cardType) {
        this.cardName = name;
        this.cardCost = cost;
        this.cardText = text;
        this.cardSet = set;
        this.cardType = cardType;
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

    public Type getCardType() {
        return cardType;
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

    public void setCardSet(Set cardSet) { this.cardSet = cardSet;}

    public void setCardType(Type cardType) { this.cardType = cardType;}


    public void addedToDeck() {
        Log.i(TAG, cardName + " added to ownedCards.");
    }
    public void addedToKingdom() {
        Log.i(TAG, cardName + " why is this only called for estates!~.");
    }

    public enum Set {
        ALL, BASE, SEASIDE, INTRIGUE, DARK_AGES, GUILDS, ALCHEMY, PROSPERITY, ADVENTURES, HINTERLANDS, CORNUCOPIA, PROMO
    }

    public enum Type {
        TREASURE, ACTION, VICTORY, CURSE, ACTION_ATTACK, ACTION_VICTORY, ACTION_REACTION, ACTION_DURATION, TREASURE_VICTORY, RUINS,
        TREASURE_REACTION
    }

    public boolean isTreasure() {
        return ((this instanceof Treasure) || (this instanceof TreasureVictory));
    }

    public abstract void play(Turn t);


}
