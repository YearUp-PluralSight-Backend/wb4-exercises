package com.pluralsight.oop1.model.enums;

public enum RoomType {

    SINGLE(99),
    DOUBLE(124),
    SUITE(199),
    KING(139),
    QUEEN(109),
    TWIN(119),
    VIP(249);
    public int getPrice() {
        return price;
    }

    private final int price;

    RoomType(int price) {
        this.price = price;
    }
}
