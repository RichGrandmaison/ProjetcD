package com.rich.projetcd;

import com.rich.projetcd.cards.Card;

import java.util.ArrayList;

/**
 * Created by Rich on 2015-11-13.
 */
public class Kingdom {

    public ArrayList<Player> players = new ArrayList<>();
    public ArrayList<Pile> piles = new ArrayList<>();
    public ArrayList<Card> trash = new ArrayList<>();

    public Kingdom(ArrayList<Player> players) {
        this.players = players;

    }

    private void generateKingdomCards(ArrayList players) {

    }

}
