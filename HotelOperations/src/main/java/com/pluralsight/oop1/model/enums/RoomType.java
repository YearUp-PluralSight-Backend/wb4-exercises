package com.pluralsight.oop1.model.enums;

public enum RoomType {

    SINGLE(1),
    DOUBLE(2),
    SUITE(3),
    KING(4),
    QUEEN(5),
    TWIN(6);
    public int getValue() {
        return value;
    }

    private final int value;

    RoomType(int value) {
        this.value = value;
    }
}
