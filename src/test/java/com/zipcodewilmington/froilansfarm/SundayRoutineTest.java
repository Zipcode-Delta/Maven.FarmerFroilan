package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.Assert.*;

public class SundayRoutineTest {
    Farm farmTest = new Farm();

    @Test
    public void test1SundayRoutine() {
        farmTest.setUp();
        Assert.assertEquals(100, farmTest.earCorn.getNumberOfEdibleCrops());
        Assert.assertEquals(10, farmTest.tomato.getNumberOfEdibleCrops());
        farmTest.sundayRoutine();
        Assert.assertEquals(67, farmTest.earCorn.getNumberOfEdibleCrops());
        Assert.assertEquals(7, farmTest.tomato.getNumberOfEdibleCrops());
    }

    @Test
    public void test2SundayRoutine() {
        farmTest.setUp();
        farmTest.sundayRoutine();
        for (int i = 0; i < farmTest.stable1.getNumOfHorses(); i++) {
            Assert.assertTrue(farmTest.stable1.getByIndex(i).isBeingRidden());
        }
    }

    @Test
    public void test3SundayRoutine() {
        //need test to check that crops were planted
    }




}
