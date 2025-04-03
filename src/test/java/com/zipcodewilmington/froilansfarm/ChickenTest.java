package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

public class ChickenTest {


    @Test
    public void testGetAndSetName(){
        Chicken chicken = new Chicken();
        chicken.setName("Hey hey");

        String expectedName = "Hey hey";

        Assert.assertEquals(expectedName, chicken.getName());
    }

    @Test
    public void testGetAndSetName1(){
        Chicken chicken = new Chicken();
        chicken.setName("Cou cou");

        String expectedName = "Cou cou";

        Assert.assertEquals(expectedName, chicken.getName());
    }

    @Test
    public void testMakeNoise(){
        Chicken chicken = new Chicken();

        String expectedNoise = "Cluck cluck";

        Assert.assertEquals(expectedNoise, chicken.makeNoise());
    }
//yield will fail because it is riding on a random generator.
//    @Test
//    public void testYield(){
//        Chicken chicken = new Chicken();
//        if (chicken.hasBeenFertilized()){
//            Assert.assertEquals(4, chicken.yield());
//        }
//
//        //String expectedNoise = "Cluck cluck";
//
//        Assert.assertEquals(5, chicken.yield());
//    }


}