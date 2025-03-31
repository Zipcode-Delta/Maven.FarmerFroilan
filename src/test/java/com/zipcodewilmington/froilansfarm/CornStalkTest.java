package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CornStalkTest {


    @Test
    public void getNumberOfEdibleCropsTest() {
        Crop earCorn = new CornStalk();

        Assert.assertEquals(235, earCorn.getNumberOfEdibleCrops());
    }

    @Test
    public void setNumberOfEdibleCropsTest() {
        Crop earCorn = new CornStalk();
        earCorn.setNumberOfEdibleCrops(20);

        Assert.assertEquals(255, earCorn.getNumberOfEdibleCrops());
    }


}