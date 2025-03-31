package com.zipcodewilmington.froilansfarm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HorseTest {
    @Test
    void testMakeNoise() {
        Horse horse = new Horse();

        assertEquals("Neigh", horse.makeNoise(), "Horse should neigh");
    }

    @Test
    void testRide() {
        Horse horse = new Horse();

        assertFalse(horse.isBeingRidden());
        horse.ride();
        assertTrue(horse.isBeingRidden());

    }

    @Test
    void testDismountHorse() {
        Horse horse = new Horse();
        horse.ride();
        assertTrue(horse.isBeingRidden());
        horse.dismount();
        assertFalse(horse.isBeingRidden());
    }

}