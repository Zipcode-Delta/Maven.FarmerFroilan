package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TomatoPlantTest {
    @Test
    public void getNumberOfEdibleCropsTest(){
        Crop tomato = new TomatoPlant();

        Assert.assertEquals(30, tomato.getNumberOfEdibleCrops());
    }

    @Test
    public void setNumberOfEdibleCropsTest(){
        Crop tomato = new TomatoPlant();
        tomato.setNumberOfEdibleCrops(20);

        Assert.assertEquals(50, tomato.getNumberOfEdibleCrops());
    }


}