package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CropDusterTest {

    @Test
    public void TestConstructor(){
        CropDuster cropDuster = new CropDuster();
        Assert.assertNotNull(cropDuster);
    }

    @Test
    public void TestGetAndSetType(){
       //Given
        Vehicle cropDuster = new CropDuster();
       String expectedType = "cropDuster";

       //When
        cropDuster.setType("cropDuster");
        String actualType = cropDuster.getType();

        //Then
        Assert.assertEquals(expectedType, actualType);
    }

    @Test
    public void TestMakeNoise(){
        //Given
        Vehicle cropDuster = new CropDuster();
        String expectedNoise = "Hum roar hum roar";

        //When
        String actualNoise = cropDuster.makeNoise();

        //Then
        Assert.assertEquals(expectedNoise, actualNoise);
    }

    @Test
    public void TestFly(){
        //Given
        CropDuster cropDuster = new CropDuster();
        String expectedNoise = "Fertilizing...";

        //When
        String actualNoise = cropDuster.fly();

        //Then
        Assert.assertEquals(expectedNoise, actualNoise);
    }




}