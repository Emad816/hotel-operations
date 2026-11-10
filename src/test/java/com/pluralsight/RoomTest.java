package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @Test
    void checkIn() {
        //room should be occupied and dirty
        //arrange
        Room f18n16 = new Room();

        //act
        f18n16.checkIn();

        //assert
        assertEquals(true, f18n16.isOccupied());
        assertEquals(true, f18n16.isDirty());
    }

    @Test
    void checkOut() {
        //room should be not occupied, and dirty
        //arrange
        Room f17n07 = new Room();

        //act
        f17n07.checkOut();

        //assert
        assertEquals(false, f17n07.isOccupied());
        assertEquals(true, f17n07.isDirty());
    }

    @Test
    void cleanRoom() {
        //room should be not dirty and not occupied
        //arrange
        Room f12n02 = new Room();

        //act
        f12n02.cleanRoom();

        //assert
        assertEquals();
    }
}