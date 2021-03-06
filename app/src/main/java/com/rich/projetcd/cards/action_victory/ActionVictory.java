package com.rich.projetcd.cards.treasure_victory;

import com.rich.projetcd.Player;
import com.rich.projetcd.Turn;
import com.rich.projetcd.cards.Card;

/**
 * Created by rich on 16/12/15.
 */
public abstract class ActionVictory extends Card {

    private Type type = Type.ACTION_VICTORY;

    public abstract void playAction(Turn turn);

    public abstract void resolvePoints(Player player);


}
