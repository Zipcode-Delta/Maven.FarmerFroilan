package com.zipcodewilmington.froilansfarm;

import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
import com.zipcodewilmington.froilansfarm.Chicken;
import com.zipcodewilmington.froilansfarm.Shelter;
import com.zipcodewilmington.froilansfarm.ChickenCoop;
import org.junit.jupiter.api.Test;

class ChickenCoopTest {

//    @BeforeEach
//    void setUp() {
//        ChickenCoop.clear();
//    }

    @Test
    public void testInstanceOf() {
        //check inheritance
    }

    @Test
    public void testNullConstructor() {
        //if no args are given during construction
        //should return as an empty ChickenCoop
        //may or may not be needed
    }

    @Test
    public void testArgsConstructor() {
        //if arrayList is passed as arg
        //take arrayList as contents of ChickenCoop
        //may not be needed
    }

    @Test
    public void test1addChicken() {
        //test that Chicken can be added before construction
    }

    @Test
    public void test2addChicken() {
        //test that Chicken can be added after construction
    }

    @Test
    public void test3addChicken() {
        //check that construction with generic Animal can still be added
    }

    @Test
    public void test4addChicken() {
        //check that constructor with generic Eater can still be added
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