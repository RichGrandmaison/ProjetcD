package com.rich.projetcd;

import android.util.Log;

import java.util.ArrayList;

/**
 * Created by rich on 16/12/15.
 */
public class GameManager {

    private static final String TAG = "   *** game manager: ";

    private int turnCounter = 0;
    private int nextPlayer = 0;
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

    public void startGame() {

        generatePlayers(3);
        generateKingdom();

        while(gameNotFinished()) { //TODO win condition

            Turn turn = new Turn(players.get(nextPlayer++ % players.size()));
            turnCounter++;
            turn.playTurn();
        }

    }

    public void generatePlayers(int numberOfPlayers) { //TODO switch to after test
        for (int i = 0; i < numberOfPlayers; i++) {
            Player newPlayer = new Player();
            newPlayer.name = "Player " + (1 + i);
            addPlayer(newPlayer);
            newPlayer.generateInitialDeck(); //should be later, after kindgom is generated to decide for Hovel and shit
            Log.i(TAG, "added " + newPlayer.name + " to the game.");
        }
    }

    public void generateKingdom() { //TODO switch to after test
        Kingdom kd = new Kingdom(this);
        kd.generateFixedSetup();
        Log.i(TAG, " generate a kingdom.");
    }

    private boolean gameNotFinished() {
        return !this.kingdom.checkIfGameIsOver();
    }
}
