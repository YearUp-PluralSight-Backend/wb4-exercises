package com.pluralsight;

import com.pluralsight.oop1.model.Reservation;
import com.pluralsight.oop1.model.enums.RoomType;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


// https://howtodoinjava.com/java/date-time/finding-day-of-week/#:~:text=Get%20the%20Day%20of%20Week%20using%20LocalDate%20(Java%208)&text=LocalDate%20today%20%3D%20LocalDate.,out.
public class ReservationTest {



    @Test
    @DisplayName("Testing the reservation class with stay 2 days and room type QUEEN")
    public void testOne() {
        Reservation  reservation = new Reservation(1, 2, RoomType.QUEEN);
        try {
            double expected = 2 * RoomType.QUEEN.getPrice();
//                    + (1 * RoomType.QUEEN.getPrice() * 1.1);
            double price = reservation.calculateTotalPrice();
            System.out.println(expected == price);
            assertEquals(expected, price);

        } catch (Exception e) {
            e.printStackTrace();

        }
    }


    @Test
    @DisplayName("Testing the reservation class with stay 7 days and room type QUEEN")
    public void testTwo() {
        Reservation  reservation = new Reservation(1, 7, RoomType.QUEEN);
        try {

            double expected = 5 * RoomType.QUEEN.getPrice() + (2 * RoomType.QUEEN.getPrice() * 1.1);
            double price = reservation.calculateTotalPrice();
            System.out.println(expected == price);
            assertEquals(expected, price);

        } catch (Exception e) {
            e.printStackTrace();

        }
    }


    @Test
    @DisplayName("Testing the reservation class with stay 2 days and room type King")
    public void testThree() {
        Reservation  reservation = new Reservation(1, 2, RoomType.KING);
        try {
            double expected = 2 * RoomType.KING.getPrice() ;
            double price = reservation.calculateTotalPrice();
            System.out.println(expected == price);
            assertEquals(expected, price);

        } catch (Exception e) {
            e.printStackTrace();

        }
    }


    @Test
    @DisplayName("Testing the reservation class with stay 7 days and room type KING")
    public void testFour() {
        Reservation  reservation = new Reservation(1, 7, RoomType.KING);
        try {
            double expected = 5 * RoomType.KING.getPrice()  + (2 * RoomType.KING.getPrice() * 1.1);
            double price = reservation.calculateTotalPrice();
            System.out.println(expected == price);
            assertEquals(expected, price);

        } catch (Exception e) {
            e.printStackTrace();

        }
    }

}
