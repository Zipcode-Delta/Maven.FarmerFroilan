package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CornStalkTest {


    @Test
    public void getNumberOfEdibleCropsTest() {
        Crop earCorn = new CornStalk("earCorn");
        earCorn.setNumberOfEdibleCrops(100);

        Assert.assertEquals(100, earCorn.getNumberOfEdibleCrops());
    }

    @Test
    public void setNumberOfEdibleCropsTest() {
        Crop earCorn = new CornStalk("earCorn");
        earCorn.setNumberOfEdibleCrops(100);
        earCorn.addEdibleCrops(20);


        Assert.assertEquals(120, earCorn.getNumberOfEdibleCrops());
    }


}