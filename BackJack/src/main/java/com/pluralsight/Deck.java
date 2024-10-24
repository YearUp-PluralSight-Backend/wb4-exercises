package com.pluralsight;


import com.pluralsight.model.Card;
import com.pluralsight.model.Suite;
import com.pluralsight.model.Value;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

//    ♥️
//    ♠️
//    ♣️
//    ♦️
public class Deck {

    private List<Card> cardList;
    Random random = new Random();
    private int totalOfRemainingCards;



    private Deck() {

        cardList = new ArrayList<>();

        for(Suite suite: Suite.values()) {
            for (Value value: Value.values()) {
                cardList.add(new Card(suite, value));
            }
        }
    }

    public Deck getInstance() {
        return new Deck();
    }


    public void shuffle() {
        Collections.shuffle(cardList);
        totalOfRemainingCards = cardList.size();
    }

    public Card deal() {
        int nextInt = random.nextInt(1, 53);
        totalOfRemainingCards--;
        Card card = cardList.remove(nextInt);
        return card;
    }

    public int getTotalOfRemainingCards() {
        return totalOfRemainingCards;
    }






}
