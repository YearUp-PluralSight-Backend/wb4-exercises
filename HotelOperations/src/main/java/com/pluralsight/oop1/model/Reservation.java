package com.pluralsight.oop1.model;

import com.pluralsight.oop1.model.enums.RoomType;

/**
 * Represents a reservation in a hotel or similar establishment.
 */
public class Reservation {

    private int id;
    private Room room;
    private int numberOfNights;
    private boolean isWeekend;
    private double price;
    private double totalPrice;

    /**
     * Default constructor.
     */
    public Reservation() {
    }

    /**
     * Parameterized constructor to initialize a reservation with specific attributes.
     *
     * @param id the unique identifier for the reservation
     * @param room the room associated with the reservation
     * @param numberOfNights the number of nights for the reservation
     * @param isWeekend whether the reservation includes a weekend
     * @param price the price per night for the reservation
     */
    public Reservation(int id, Room room, int numberOfNights, boolean isWeekend, double price) {
        this.id = id;
        this.room = room;
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;
        this.price = price;
    }

    /**
     * Gets the unique identifier for the reservation.
     *
     * @return the reservation ID
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the unique identifier for the reservation.
     *
     * @param id the reservation ID
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Gets the room associated with the reservation.
     *
     * @return the room
     */
    public Room getRoom() {
        return room;
    }

    /**
     * Sets the room associated with the reservation.
     *
     * @param room the room
     */
    public void setRoom(Room room) {
        this.room = room;
    }

    /**
     * Gets the number of nights for the reservation.
     *
     * @return the number of nights
     */
    public int getNumberOfNights() {
        return numberOfNights;
    }

    /**
     * Sets the number of nights for the reservation.
     *
     * @param numberOfNights the number of nights
     */
    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    /**
     * Checks if the reservation includes a weekend.
     *
     * @return true if the reservation includes a weekend, false otherwise
     */
    public boolean isWeekend() {
        return isWeekend;
    }

    /**
     * Sets whether the reservation includes a weekend.
     *
     * @param weekend true if the reservation includes a weekend, false otherwise
     */
    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
    }

    /**
     * Gets the price per night for the reservation.
     *
     * @return the price per night
     */
    public double getPrice() {
        return price;
    }

    /**
     * Sets the price per night for the reservation.
     *
     * @param price the price per night
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Gets the total price for the reservation.
     *
     * @return the total price
     */
    public double getTotalPrice() {
        return totalPrice;
    }

    /**
     * Sets the total price for the reservation based on the room type and whether it includes a weekend.
     */
    public void setTotalPrice() {
        if (!isWeekend()) {
            this.totalPrice = room.getRoomType().equals(RoomType.DOUBLE) ?
                    getNumberOfNights() * 124 : getNumberOfNights() * 139;
        } else {
            this.totalPrice = room.getRoomType().equals(RoomType.DOUBLE) ?
                    ((getNumberOfNights() * 124 * 0.1) + getNumberOfNights() * 124)
                    : ((getNumberOfNights() * 139 * 0.1) + getNumberOfNights() * 139);
        }
    }
}