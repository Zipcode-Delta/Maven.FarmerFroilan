package com.zipcodewilmington.froilansfarm;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.Test;

public class YamPlantTest {

    @Test
    public void setNumberOfEdibleCropsTest() {
        Crop yamPlant = new YamPlant("yamPlant");
        yamPlant.setNumberOfEdibleCrops(30);
        Assert.assertEquals(30, yamPlant.getNumberOfEdibleCrops());
    }

    @Test
    public void addEdibleCropsTest() {
        Crop yamPlant = new YamPlant("yamPlant");
        yamPlant.setNumberOfEdibleCrops(30);
        Assert.assertEquals(30, yamPlant.getNumberOfEdibleCrops());
        yamPlant.addEdibleCrops(20);
        Assert.assertEquals(50, yamPlant.getNumberOfEdibleCrops());
    }

}