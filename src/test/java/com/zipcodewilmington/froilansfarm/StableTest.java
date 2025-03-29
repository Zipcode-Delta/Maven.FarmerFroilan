package com.zipcodewilmington.froilansfarm;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.util.Collection;

class StableTest {

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
        stableTest.add(horse);
        Horse actual = stableTest.getByName("Henry");
        assertEquals(horse, actual);
    }

    @Test
    public void test1removeHorse() {
        Stable stableTest = new Stable();
        Horse horse = new Horse();
        stableTest.add(horse);
        assertEquals(1, stableTest.getNumOfHorses());
        stableTest.remove(horse);
        assertEquals(0, stableTest.getNumOfHorses());
    }

    @Test
    public void test2removeHorse() {
        Stable stableTest = new Stable();
        Horse horse = new Horse();
        horse.setName("Henry");
        stableTest.add(horse);
        assertEquals(1, stableTest.getNumOfHorses());
        stableTest.remove("Henry");
        assertEquals(0, stableTest.getNumOfHorses());
    }

    @Test
    public void test1getNumOfHorses() {
        Stable stableTest = new Stable();
        assertEquals(0, stableTest.getNumOfHorses());
    }

    @Test
    public void test2getNumOfHorses() {
        Stable stableTest = new Stable();
        stableTest.add(new Horse());
        stableTest.add(new Horse());
        assertEquals(2, stableTest.getNumOfHorses());
    }

    @Test
    public void test3getNumOfHorses() {
        Stable stableTest1 = new Stable();
        Stable stableTest2 = new Stable();
        stableTest1.add(new Horse());
        stableTest1.add(new Horse());
        stableTest2.add(new Horse());
        assertEquals(2, stableTest1.getNumOfHorses());
        assertEquals(1, stableTest2.getNumOfHorses());
    }

    @Test
    public void test1clearStable() {
        Stable stableTest = new Stable();
        stableTest.add(new Horse());
        stableTest.add(new Horse());
        assertEquals(2, stableTest.getNumOfHorses());
        stableTest.clearStable();
        assertEquals(0, stableTest.getNumOfHorses());
    }
}