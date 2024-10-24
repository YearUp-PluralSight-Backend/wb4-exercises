package com.pluralsight;

public enum Value {

    ACE(11),
    KING(10),
    QUEENS(10),
    JACK(10),
    One(1),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    Ten(10);

    private final int value;

    Value(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
