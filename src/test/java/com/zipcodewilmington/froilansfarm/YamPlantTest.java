package com.zipcodewilmington.froilansfarm;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.Test;

class YamPlantTest {

    @Test
    public void getNumberOfEdibleCropsTest() {
        Crop yamPlant = new YamPlant("yamPlant");
        yamPlant.setNumberOfEdibleCrops(30);
        Assert.assertEquals(30, yamPlant.getNumberOfEdibleCrops());
    }



}