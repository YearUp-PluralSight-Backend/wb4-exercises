package com.pluralsight.oop1.model;

import com.pluralsight.oop1.exceptions.RoomException;
import com.pluralsight.oop1.exceptions.RoomTypeException;
import com.pluralsight.oop1.model.enums.RoomType;

/**
 * Represents a room in a hotel or similar establishment.
 */
public class Room {

    private int roomNumber;
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
     * @param roomNumber the unique identifier for the room
     * @param numberOfBeds the number of beds in the room
     * @param price the price of the room per night
     * @param isOccupied the occupancy status of the room
     * @param isDirty the cleanliness status of the room
     * @param roomType the type of the room
     */
    public Room(int roomNumber, int numberOfBeds, double price, boolean isOccupied, boolean isDirty, RoomType roomType) {
        this.roomNumber = roomNumber;
        this.NumberOfBeds = numberOfBeds;
        this.price = price;
        this.isOccupied = isOccupied;
        this.isDirty = isDirty;
        this.roomType = roomType;
    }

    /**
     * Gets the unique identifier for the room.
     *
     * @return the room roomNumber
     */
    public int getRoomNumber() {
        return roomNumber;
    }

    /**
     * Sets the unique identifier for the room.
     *
     * @param roomNumber the room roomNumber
     */
    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
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

    /**
     * Gets the type of the room.
     *
     * @return the room type
     */
    public RoomType getRoomType() {
        return roomType;
    }

    /**
     * Sets the type of the room.
     *
     * @param roomType the room type
     */
    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }


    public void checkIn(){
        if (isAvailable()) {
            System.out.println("Check in successful");
        }
        if (isOccupied) {
            System.out.println("Room is occupied");
        }
        if (isDirty) {
            System.out.println("Room needs to clean before check in");
        }

        isOccupied = true;
        isDirty = true;

    }

    public void checkOut() {

        if (!isOccupied) {
            System.out.println("Room is not occupied");
            return;
        }
        isOccupied = false;
        cleanRoom();
    }

    public void cleanRoom() {

        if (!isDirty) {
            System.out.println("Room is already cleaned");
        }

        isDirty = false;
    }

}