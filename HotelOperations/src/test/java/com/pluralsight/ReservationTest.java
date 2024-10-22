package com.pluralsight;

import com.pluralsight.oop1.model.Reservation;
import com.pluralsight.oop1.model.enums.RoomType;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;



public class ReservationTest {


    static Reservation  reservation = new Reservation(1, 2, RoomType.QUEEN);;

    @Test
    public void testOne() {

        try {
            double expected = 2 * RoomType.QUEEN.getPrice() ;
            double price = reservation.calculateTotalPrice();
            System.out.println(expected == price);
            assertEquals(expected, price);

        } catch (Exception e) {
            e.printStackTrace();

        }
    }

}
