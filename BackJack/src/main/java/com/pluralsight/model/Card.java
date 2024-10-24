package com.pluralsight.model;

public class Card {

    private Suite suite;
    private Value value;
    private boolean isFaceUp;

    public Card() {
    }

    public Card(Suite suite, Value value) {
        this.suite = suite;
        this.value = value;
        this.isFaceUp = false;
    }

    public Suite getSuite(){
        return suite;
    }

    public Value getValue() {
        return value;
    }

    public int getPointValue() {
        return value.getValue();
    }

    public boolean isFaceUp() {
        return isFaceUp;
    }

    public void flip() {
        isFaceUp = !isFaceUp;
    }


}
