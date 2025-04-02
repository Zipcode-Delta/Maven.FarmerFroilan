package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class MorningRoutineTest {
    @Test
    public void FeedHorseTest() {
        Horse horse = new Horse();
        CornStalk earCorn = new CornStalk();
        horse.eat(earCorn, 3);

        int expectedNumberOfEarCorn = 467;

        Assert.assertEquals(expectedNumberOfEarCorn, earCorn.getNumberOfEdibleCrops());
    }

    @Test
    public void FeedHorseTest2() {
        Horse horse = new Horse();
        CornStalk earCorn = new CornStalk();
        horse.eat(earCorn, 10);

        int expectedNumberOfEarCorn = 460;

        Assert.assertEquals(expectedNumberOfEarCorn, earCorn.getNumberOfEdibleCrops());
    }

    @Test
    public void FeedFarmerTest() {
        Person farmer = new Farmer();
        Crop earCorn = new CornStalk();
        Crop tomato = new TomatoPlant();
        farmer.eat(tomato, 2);
        farmer.eat(earCorn, 1);

        int expectedNumberOfEarCorn = 235;
        int expectedNumberOfTomato = 30;

        Assert.assertEquals(expectedNumberOfEarCorn, earCorn.getNumberOfEdibleCrops());
        Assert.assertEquals(expectedNumberOfTomato, tomato.getNumberOfEdibleCrops());
    }
}
