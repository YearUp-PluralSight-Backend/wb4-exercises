package com.pluralsight.oop1.model;

/**
 * Represents a room in a hotel or similar establishment.
 */
public class Room {

    private int id;
    private int NumberOfBeds;
    private double price;
    private boolean isOccupied;
    private boolean isDirty;
    private RoomType roomType;

    /**
     * Default constructor.
     */
    public Room() {}

    /**
     * Parameterized constructor to initialize a room with specific attributes.
     *
     * @param id the unique identifier for the room
     * @param numberOfBeds the number of beds in the room
     * @param price the price of the room per night
     * @param isOccupied the occupancy status of the room
     * @param isDirty the cleanliness status of the room
     */
    public Room(int id, int numberOfBeds, double price, boolean isOccupied, boolean isDirty) {
        this.id = id;
        this.NumberOfBeds = numberOfBeds;
        this.price = price;
        this.isOccupied = isOccupied;
        this.isDirty = isDirty;
    }

    /**
     * Gets the unique identifier for the room.
     *
     * @return the room ID
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the unique identifier for the room.
     *
     * @param id the room ID
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Gets the number of beds in the room.
     *
     * @return the number of beds
     */
    public int getNumberOfBeds() {
        return NumberOfBeds;
    }

    /**
     * Sets the number of beds in the room.
     *
     * @param numberOfBeds the number of beds
     */
    public void setNumberOfBeds(int numberOfBeds) {
        NumberOfBeds = numberOfBeds;
    }

    /**
     * Gets the price of the room per night.
     *
     * @return the room price
     */
    public double getPrice() {
        return price;
    }

    /**
     * Sets the price of the room per night.
     *
     * @param price the room price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Checks if the room is currently occupied.
     *
     * @return true if the room is occupied, false otherwise
     */
    public boolean isOccupied() {
        return isOccupied;
    }

    /**
     * Sets the occupancy status of the room.
     *
     * @param occupied true if the room is occupied, false otherwise
     */
    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    /**
     * Checks if the room is dirty.
     *
     * @return true if the room is dirty, false otherwise
     */
    public boolean isDirty() {
        return isDirty;
    }

    /**
     * Sets the dirty status of the room.
     *
     * @param dirty true if the room is dirty, false otherwise
     */
    public void setDirty(boolean dirty) {
        isDirty = dirty;
    }

    /**
     * Checks if the room is available to rent.
     *
     * A room is available when it is neither occupied nor dirty.
     *
     * @return true if the room is available, false otherwise
     */
    public boolean isAvailable() {
        return !isOccupied && !isDirty;
    }
}