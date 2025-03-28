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
assertFalse(crop.harvest());
crop.hasBeenHarvested();
 assertTrue(crop.harvest());
 }



}
