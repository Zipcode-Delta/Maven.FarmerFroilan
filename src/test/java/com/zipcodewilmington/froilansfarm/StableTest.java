package com.zipcodewilmington.froilansfarm;

import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
import com.zipcodewilmington.froilansfarm.Horse;
import com.zipcodewilmington.froilansfarm.Shelter;
import com.zipcodewilmington.froilansfarm.Stable;
import org.junit.jupiter.api.Test;
import java.util.Collection;

class StableTest {

    @BeforeEach
    void setUp() {
        Stable.clear();
    }

    @Test
    public void testInstanceOf() {
        Stable stable = new Stable();
        assertFalse(stable instanceof Collection);
    }

    @Test
    public void testNullConstructor() {
        Stable stable = new Stable();
        assertNotNull(stable);
    }

    @Test
    public void test1addHorse() {
        //test that a Horse can be added before construction
    }

    @Test
    public void test2addHorse() {
        //test that a Horse can be added after being constructed
    }

    @Test
    public void test3addHorse() {
        //test that a Horse constructed with the generic Animal can be added
    }

    @Test
    public void test4addHorse() {
        //test that a Horse constructed with the generic Eater can be added
    }

    @Test
    public void test1getHorseByName() {
        //test that a non-existent horse cannot be returned
    }

    @Test
    public void test2getHorseByName() {
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