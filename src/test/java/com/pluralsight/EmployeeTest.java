package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void punchIn() {
        //is punched in should be true
        //arrange
        Employee emad = new Employee(047, "EMAD",
                "HR", 45.50, 0);

        //act
        emad.punchIn();

        //assert
        assertEquals(true, emad.isPunchedIn());
    }

    @Test
    void punchOut() {
        //is punched in should be false
        //arrange
        Employee emad = new Employee(047, "EMAD",
                "HR", 45.50, 0);

        //act
        emad.punchOut();

        //assert
        assertEquals(false, emad.isPunchedIn());
    }
}