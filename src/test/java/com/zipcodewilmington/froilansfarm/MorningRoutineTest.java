package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class MorningRoutineTest {
    @Test
    public void FeedHorseTest() {
        Horse horse = new Horse();
        CornStalk earCorn = new CornStalk("earCorn");
        earCorn.setNumberOfEdibleCrops(50);
        horse.eat(earCorn);

        int expectedNumberOfEarCorn = 47;

        Assert.assertEquals(expectedNumberOfEarCorn, earCorn.getNumberOfEdibleCrops());
    }

    @Test
    public void FeedHorseTest2() {
        Horse horse = new Horse();
        Crop earCorn = new CornStalk("earCorn");
        earCorn.setNumberOfEdibleCrops(100);
        horse.eat(earCorn);
        horse.eat(earCorn);

        int expectedNumberOfEarCorn = 94;

        Assert.assertEquals(expectedNumberOfEarCorn, earCorn.getNumberOfEdibleCrops());
    }

    @Test
    public void FeedFarmerTest() {
        Farmer froilin = new Farmer();
        Crop tomato = new TomatoPlant("tomato");
        Crop earCorn = new TomatoPlant("earCorn");
        earCorn.setNumberOfEdibleCrops(100);
        tomato.setNumberOfEdibleCrops(30);
        Chicken edibleEggs = new Chicken();
        edibleEggs.setNumOfEdibleEggs(35);
        froilin.eat(earCorn, edibleEggs);
        froilin.eat(tomato);

        int expectedNumberOfEarCorn = 99;
        int expectedNumberOfTomato = 28;
        int expectedNumberOfEdibleEggs = edibleEggs.removeNumberOfEggs(5);

        Assert.assertEquals(expectedNumberOfEarCorn, earCorn.getNumberOfEdibleCrops());
        Assert.assertEquals(expectedNumberOfTomato, tomato.getNumberOfEdibleCrops());
        Assert.assertEquals(expectedNumberOfEdibleEggs, edibleEggs.getNumOfEdibleEggs());
    }

    @Test
    public void FeedPilotTest2() {
        Farmer froilin = new Farmer();
        Crop tomato = new TomatoPlant("tomato");
        Crop earCorn = new TomatoPlant("earCorn");
        earCorn.setNumberOfEdibleCrops(100);
        tomato.setNumberOfEdibleCrops(30);
        Chicken edibleEggs = new Chicken();
        edibleEggs.setNumOfEdibleEggs(35);
        froilin.eat(earCorn, edibleEggs);
        froilin.eat(tomato);

        int expectedNumberOfEarCorn = earCorn.removeEdibleCrops(2);
        int expectedNumberOfTomato = tomato.removeEdibleCrops(1);
        int expectedNumberOfEdibleEggs = edibleEggs.removeNumberOfEggs(2);

        Assert.assertEquals(expectedNumberOfEarCorn, earCorn.getNumberOfEdibleCrops());
        Assert.assertEquals(expectedNumberOfTomato, tomato.getNumberOfEdibleCrops());
        Assert.assertEquals(expectedNumberOfEdibleEggs, edibleEggs.getNumOfEdibleEggs());
    }

}
