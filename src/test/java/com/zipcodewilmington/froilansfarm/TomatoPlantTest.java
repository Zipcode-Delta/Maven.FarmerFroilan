package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TomatoPlantTest {
    @Test
    public void getNumberOfEdibleCropsTest(){
        Crop tomato = new TomatoPlant("tomato");
        tomato.setNumberOfEdibleCrops(5);
        int expectedNumOfTomato = tomato.removeEdibleCrops(3);
        Assert.assertEquals(expectedNumOfTomato, tomato.getNumberOfEdibleCrops());
    }

    @Test
    public void setNumberOfEdibleCropsTest(){
        Crop tomato = new TomatoPlant("tomato");
        tomato.setNumberOfEdibleCrops(20);
        int expectedNumOfTomato = tomato.removeEdibleCrops(3);

        Assert.assertEquals(expectedNumOfTomato, tomato.getNumberOfEdibleCrops());
    }


}