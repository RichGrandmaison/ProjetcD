package com.rich.projetcd;

import com.rich.projetcd.cards.Card;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Rich on 2015-11-13.
 */
public class Discard {

    ArrayList<Card> discards = new ArrayList<>();

    public void shuffle() {

        Collections.shuffle(this.discards);

    }
}
