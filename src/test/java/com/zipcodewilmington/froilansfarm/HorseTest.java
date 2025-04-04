package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HorseTest {
    @Test
    public void testMakeNoise() {
        Horse horse = new Horse();

        assertEquals("Neigh", horse.makeNoise(), "Horse should neigh");
    }

    @Test
    public void testRide() {
        Horse horse = new Horse();

        assertFalse(horse.isBeingRidden());
        horse.ride();
        assertTrue(horse.isBeingRidden());

    }

    @Test
    public void testDismountHorse() {
        Horse horse = new Horse();
        horse.ride();
        assertTrue(horse.isBeingRidden());
        horse.dismount();
        assertFalse(horse.isBeingRidden());
    }

    @Test
    public void testGetAndSetName(){
        Horse horse = new Horse();
        horse.setName("Lucky");

        String expectedName = "Lucky";

        Assert.assertEquals(expectedName, horse.getName());
    }

    @Test
    public void testGetAndSetName1(){
        Horse horse = new Horse();
        horse.setName("Kumbayo");

        String expectedName = "Kumbayo";

        Assert.assertEquals(expectedName, horse.getName());
    }

    @Test
    public void testMakeNoise1(){
        Horse horse = new Horse();

        String expectedNoise = "Neigh";

        Assert.assertEquals(expectedNoise, horse.makeNoise());
    }

    @Test
    public void testRide1(){
        Horse horse = new Horse();

        String expectedNoise = "Cluck cluck";

        Assert.assertFalse( horse.ride());
    }



}