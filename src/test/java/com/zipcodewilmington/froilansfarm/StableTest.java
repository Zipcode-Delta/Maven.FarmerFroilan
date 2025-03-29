package com.zipcodewilmington.froilansfarm;

import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.util.Collection;

class StableTest {

    @BeforeEach
    void setUp() {
        Stable.clear();
    }

    @Test
    public void testInstanceOf() {
        Stable stableTest = new Stable();
        assertFalse(stableTest instanceof Collection);
    }

    @Test
    public void testNullConstructor() {
        Stable stableTest = new Stable();
        assertNotNull(stableTest);
    }

    @Test
    public void test1addHorse() {
        Stable stableTest = new Stable();
        stableTest.add(new Horse());
        assertEquals(1, stableTest.getNumOfHorses());
    }

    @Test
    public void test2addHorse() {
        Stable stableTest = new Stable();
        Horse horse = new Horse();
        stableTest.add(horse);
        assertEquals(1, stableTest.getNumOfHorses());
    }

    @Test
    public void test3addHorse() {
        Stable stableTest = new Stable();
        Horse horse1 = new Horse();
        Horse horse2 = new Horse();
        stableTest.add(horse1);
        stableTest.add(horse2);
        assertEquals(2, stableTest.getNumOfHorses());
    }

    @Test
    public void test1getHorseByName() {
        Stable stableTest = new Stable();
        assertNull(stableTest.getByName("Henry"));
    }

    @Test
    public void test2getHorseByName() {
        Stable stableTest = new Stable();
        Horse horse = new Horse();
        horse.setName("Henry");
        Horse actual = stableTest.getByName("Henry");
        assertEquals(horse, actual);
        //test that a horse in the array can be returned
    }

    @Test
    public void test1removeHorse() {
        //test that a Horse can be removed
    }

    @Test
    public void test2removeHorse() {
        //test that a Horse can be removed by name
    }

    @Test
    public void test1getNumOfHorses() {
        //test that an empty stable returns 0
    }

    @Test
    public void test2getNumOfHorses() {
        //confirm that the number of horses
        //in the stable changes as horses are added
    }

    @Test
    public void test3getNumOfHorses() {
        //confirm that when this method is called on a specific stable
        //it only returns the number for that specific stable
        //ie: if stable1 has 2 horses and stable3 has 4
        //stable1.getNumOfHorses() should return 2, not 4
    }
}