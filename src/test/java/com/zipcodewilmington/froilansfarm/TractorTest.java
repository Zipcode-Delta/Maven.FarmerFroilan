package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TractorTest {
    @Test
    public void TestConstructor(){
        Vehicle tractor = new Tractor();
        Assert.assertNotNull(tractor);
    }

    @Test
    public void TestGetAndSetType(){
        //Given
        Tractor tractor = new Tractor();
        String expectedType = "tractor";

        //When
        tractor.setType("tractor");
        String actualType = tractor.getType();

        //Then
        Assert.assertEquals(expectedType, actualType);
    }

    @Test
    public void TestMakeNoise(){
        //Given
        Vehicle tractor = new Tractor();
        String expectedNoise = "PUH PUH PUH PUH";

        //When
        String actualNoise = tractor.makeNoise();

        //Then
        Assert.assertEquals(expectedNoise, actualNoise);
    }

    @Test
    public void TestRide(){
        //Given
        Vehicle tractor = new Tractor();


        //When
        Assert.assertFalse(tractor.ride());


    }



}