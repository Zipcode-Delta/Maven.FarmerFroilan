package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HorseTest {

    @Test
    public void TestGetAndSetName() {
        Animal horse = new Horse();
        horse.setName("Horse");

        String expectedName = "Horse";

        Assert.assertEquals(expectedName, horse.getName());
    }

    @Test
    public void TestGetAndSetName1() {
        Animal horse = new Horse();
        horse.setName("Horse1");

        String expectedName = "Horse1";

        Assert.assertEquals(expectedName, horse.getName());
    }

    @Test
    public void TestMakeNoise() {
        Animal horse = new Horse();

        String expectedNoise = "Neigh";

        Assert.assertEquals(expectedNoise, horse.makeNoise());
    }

    @Test
    public void TestRide() {
        Horse horse = new Horse();


        Assert.assertFalse(horse.ride());

    }

}