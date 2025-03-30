package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ChickenTest {

    @Test
    public void testGetAndSetNames(){
        Animal chicken = new Chicken();
        chicken.setName("Chicken");

        String expectedNAme = "Chicken";

        Assert.assertEquals(expectedNAme, chicken.getName());

    }

    @Test
    public void testGetNumberOfEggs(){
        Chicken chicken = new Chicken();
        chicken.setNumOfEdibleEggs(40);
        chicken.setNumOfEdibleEggs(20);

        int expectedNumberOfEggs = 60;

        Assert.assertEquals(expectedNumberOfEggs, chicken.getNumOfEdibleEggs());
    }

    @Test
    public void testGetNumberOfEggs2(){
        Chicken chicken = new Chicken();
        chicken.setNumOfEdibleEggs(20);
        chicken.setNumOfEdibleEggs(20);

        int expectedNumberOfEggs = 40;

        Assert.assertEquals(expectedNumberOfEggs, chicken.yield());
    }

    @Test
    public void testHasBeenFertilized() {
        Chicken chicken = new Chicken();


        Assert.assertTrue(chicken.hasBeenFertilized());

    }


}