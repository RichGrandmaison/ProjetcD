package com.rich.projetcd;

import java.util.ArrayList;

/**
 * Created by rich on 16/12/15.
 */
public class GameManager {

    private Kingdom kingdom;
    private ArrayList<Player> players = new ArrayList<>();

    public void addPlayer(Player addedPlayer) {
        this.players.add(addedPlayer);
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public Player getPlayerAtIndex(int i) {
        return players.get(i);
    }

    public void addKingdom(Kingdom k) {
        this.kingdom = k;
    }

    public Kingdom getKingdom() {
        return this.kingdom;
    }

    public int getPlayerCount() {
        return this.players.size();
    }
}
