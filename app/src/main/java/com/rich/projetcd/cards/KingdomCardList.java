package com.rich.projetcd.cards;

import android.support.annotation.NonNull;

import com.rich.projetcd.cards.actions.Smithy;
import com.rich.projetcd.cards.actions.Village;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by rich on 26/12/15.
 */
public class KingdomCardList {

    private static KingdomCardList instance = null;

   ArrayList<String> cardList = new ArrayList<>();

    public KingdomCardList() {

        cardList.add(Village.getCardName());
        cardList.add(Smithy.getCardName());

    }

    public KingdomCardList getInstance() {
        if(instance == null) {
            instance = new KingdomCardList();
        }
        return instance;
    }



}
