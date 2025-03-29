package com.zipcodewilmington.froilansfarm;

import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
import com.zipcodewilmington.froilansfarm.Chicken;
import com.zipcodewilmington.froilansfarm.Shelter;
import com.zipcodewilmington.froilansfarm.ChickenCoop;
import org.junit.jupiter.api.Test;
import java.util.Collection;

class ChickenCoopTest {

//    @BeforeEach
//    void setUp() {
//        ChickenCoop.clear();
//    }

    @Test
    public void testInstanceOf() {
        ChickenCoop chickenCoop = new ChickenCoop();
        assertFalse(chickenCoop instanceof Collection);
    }

    @Test
    public void testNullConstructor() {
        ChickenCoop chickenCoop = new ChickenCoop();
        assertNotNull(chickenCoop);
    }

    @Test
    public void test1addChicken() {
        ChickenCoop chickenCoop = new ChickenCoop();
        chickenCoop.add(new Chicken());
        assertEquals(1, chickenCoop.getNumOfChickens());
    }

    @Test
    public void test2addChicken() {
        ChickenCoop chickenCoop = new ChickenCoop();

        //test that Chicken can be added after construction
    }

    @Test
    public void test3addChicken() {
        //check that construction with generic Animal can still be added
    }

    @Test
    public void test1removeChicken() {
        //check that Chicken can be removed
    }

    @Test
    public void test2removeChicken() {
        //check that Chicken can be removed by name
    }

    @Test
    public void test1getNumOfChickens() {
        //testing empty chickenCoop, should return 0
    }

    @Test
    public void test2getNumOfChickens() {
        //testing that num of chickens
        //returned changes as chickens are added to one coop
    }

    @Test
    public void test3getNumOfChickens() {
        //confirm that when this method is called
        //it only returns the value for that specific coop
    }

}