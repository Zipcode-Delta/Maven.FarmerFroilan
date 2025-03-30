package com.zipcodewilmington.froilansfarm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class CropRowTest {
private CropRow cropRow;
@BeforeEach
void setUp() {
    cropRow = new CropRow();
}
@Test
    void testSetNumOfCrops() {
    cropRow.setNumOfCrops(10);
    assertEquals(10,cropRow.getNumOfCrops());
}








}