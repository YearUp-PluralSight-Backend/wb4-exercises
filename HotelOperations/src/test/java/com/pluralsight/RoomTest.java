package com.pluralsight;

import com.pluralsight.oop1.model.Room;
import com.pluralsight.oop1.model.enums.RoomType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    private Room room;

    @BeforeEach
    void setUp() {
        room = new Room(101, 2, RoomType.KING.getPrice(), false, false, RoomType.KING);
    }

    @Test
    void testDefaultConstructor() {
        Room defaultRoom = new Room();
        assertNull(defaultRoom.getRoomType());
        assertEquals(0, defaultRoom.getRoomNumber());
    }

    @Test
    void testParameterizedConstructor() {
        assertEquals(101, room.getRoomNumber());
        assertEquals(2, room.getNumberOfBeds());
        assertEquals(139, room.getPrice());
        assertFalse(room.isOccupied());
        assertFalse(room.isDirty());
        assertEquals(RoomType.KING, room.getRoomType());
    }

    @Test
    void testCheckInRoomAlreadyOccupied() {
        room.setOccupied(true);
        room.checkIn();
        assertTrue(room.isOccupied());
    }

    @Test
    void testCheckIn() {
        room.checkIn();
        assertTrue(room.isOccupied());
        assertTrue(room.isDirty());
    }

    @Test
    void testCheckOutRoomNotOccupied() {
        room.checkOut();
        assertFalse(room.isOccupied());
    }

    @Test
    void testCheckOut() {
        room.setOccupied(true);
        room.checkOut();
        assertFalse(room.isOccupied());
        assertFalse(room.isDirty());
    }

    @Test
    void testCleanRoomAlreadyClean() {
        room.setDirty(false);
        room.cleanRoom();
        assertFalse(room.isDirty());
    }

    @Test
    void testCleanRoom() {
        room.setDirty(true);
        room.cleanRoom();
        assertFalse(room.isDirty());
    }

    @Test
    void testIsAvailable() {
        assertTrue(room.isAvailable());
        room.setOccupied(true);
        assertFalse(room.isAvailable());
        room.setDirty(true);
        assertFalse(room.isAvailable());
    }
}
