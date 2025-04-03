package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class MorningRoutineTest {
    @Test
    public void FeedHorseTest() {
        Horse horse = new Horse();
        CornStalk earCorn = new CornStalk();
        horse.eat();

        int expectedNumberOfEarCorn = 100;

        Assert.assertEquals(expectedNumberOfEarCorn, earCorn.getNumberOfEdibleCrops());
    }

    @Test
    public void FeedHorseTest2() {
        Horse horse = new Horse();
        CornStalk earCorn = new CornStalk();
        horse.eat();

        int expectedNumberOfEarCorn = 100;

        Assert.assertEquals(expectedNumberOfEarCorn, earCorn.getNumberOfEdibleCrops());
    }

//    @Test
//    public void FeedFarmerTest() {
//        Person farmer = new Farmer();
//        Crop earCorn = new CornStalk();
//        Crop tomato = new TomatoPlant();
//        Chicken edibleEggs = new Chicken();
//        farmer.eat();
//
//
//        int expectedNumberOfEarCorn = 100;
//        int expectedNumberOfTomato = 30;
//        int expectedNumberOfEdibleEggs = 20;
//
//        Assert.assertEquals(expectedNumberOfEarCorn, earCorn.getNumberOfEdibleCrops());
//        Assert.assertEquals(expectedNumberOfTomato, tomato.getNumberOfEdibleCrops());
//        Assert.assertEquals(expectedNumberOfEdibleEggs, edibleEggs.getNumOfEdibleEggs());
//    }
}
