package com.pluralsight.oop1.model;

import com.pluralsight.oop1.exceptions.RoomTypeException;
import com.pluralsight.oop1.model.enums.RoomType;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * Represents a reservation in a hotel or similar establishment.
 */
public class Reservation {

    private int id;
    private Room room;
    private RoomType reservedRoomType;
    private int numberOfNights;

    /**
     * Default constructor.
     */
    public Reservation() {
    }

    /**
     * Parameterized constructor to initialize a reservation with specific attributes.
     *
     * @param id the unique identifier for the reservation
     * @param numberOfNights the number of nights for the reservation
     * @param reservedRoomType the room type for the reservation
     */
    public Reservation(int id, int numberOfNights, RoomType reservedRoomType) {
        this.id = id;
        this.reservedRoomType = reservedRoomType;
        this.numberOfNights = numberOfNights;

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
     * Gets the price per night for the reservation.
     *
     * @return the price per night
     */
    public double getPrice() throws RoomTypeException {
        double price;
        switch (this.reservedRoomType) {
            case SINGLE -> price = RoomType.SINGLE.getPrice();

            case DOUBLE -> price = RoomType.DOUBLE.getPrice();
            case SUITE -> price = RoomType.SUITE.getPrice();
            case KING -> price = RoomType.KING.getPrice();
            case QUEEN -> price = RoomType.QUEEN.getPrice();
            case TWIN -> price = RoomType.TWIN.getPrice();
            case VIP -> price = RoomType.VIP.getPrice();
            default -> throw new RoomTypeException("Invalid Room Type");
        }

        return price;
    }


    public void setReservedRoomType(RoomType reservedRoomType) {
        this.reservedRoomType = reservedRoomType;
    }

    public RoomType getReservedRoomType() {
        return reservedRoomType;
    }

    public double calculateTotalPrice() throws RoomTypeException {
        double totalPrice;
        LocalDate now = LocalDate.now();

        int numberOfWeekends = isAnyDayWeekend(now, numberOfNights);
        System.out.println(numberOfWeekends);
        if (numberOfWeekends > 0) {
            totalPrice = (getPrice() * (numberOfNights - numberOfWeekends)) + ((getPrice() * numberOfWeekends) * 1.1);
        } else {
            totalPrice = (getPrice() * numberOfNights);
        }
        System.out.println(totalPrice);
        return totalPrice;
    }

    private int isAnyDayWeekend(LocalDate startDate, int numberOfDays) {
        int numberOfWeekends = 0;
        for (int i = 0; i < numberOfDays; i++) {
            LocalDate currentDate = startDate.plusDays(i);
            if (isWeekend(currentDate)) {
                numberOfWeekends++;
            }
        }

        return numberOfWeekends;
    }

    private boolean isWeekend(LocalDate today) {
        DayOfWeek dayOfWeek = today.getDayOfWeek();
        return  dayOfWeek == DayOfWeek.SATURDAY || dayOfWeek == DayOfWeek.SUNDAY;


    }
}