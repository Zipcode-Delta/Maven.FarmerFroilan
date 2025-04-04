package com.zipcodewilmington.froilansfarm;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class CropTest {
    @Test
   void testCropName()  {

      Crop crop = new Crop ("Tomato");
assertEquals( "Tomato", crop.getName());
   }


@Test
void testHarvestCrop () {
 Crop crop = new Crop ("EarCorn");
 crop.setName("EarCorn");
assertFalse(crop.harvest());
//crop.getName();
 //assertTrue(crop.harvest());
 }

@Test
    void addEdibleCrops() {
        Crop crop = new Crop ("Tomato");
        assertEquals(0, crop.getNumberOfEdibleCrops());
        crop.addEdibleCrops(5);
        assertEquals(5, crop.getNumberOfEdibleCrops());

}

}
