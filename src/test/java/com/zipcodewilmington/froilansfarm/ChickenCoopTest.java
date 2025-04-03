package com.zipcodewilmington.froilansfarm;

import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
import com.zipcodewilmington.froilansfarm.Chicken;
import com.zipcodewilmington.froilansfarm.Shelter;
import com.zipcodewilmington.froilansfarm.ChickenCoop;
import org.junit.jupiter.api.Test;
import java.util.Collection;

class ChickenCoopTest {

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
        Chicken chicken = new Chicken();
        chickenCoop.add(chicken);
        assertEquals(1, chickenCoop.getNumOfChickens());
    }

    @Test
    public void test3addChicken() {
        ChickenCoop chickenCoop = new ChickenCoop();
        Chicken chicken1 = new Chicken();
        Chicken chicken2 = new Chicken();
        chickenCoop.add(chicken1);
        chickenCoop.add(chicken2);
        assertEquals(2, chickenCoop.getNumOfChickens());
    }

    @Test
    public void test1getChicken() {
        ChickenCoop coop = new ChickenCoop();
        Chicken chicken = new Chicken();
        coop.add(chicken);
        assertEquals(chicken, coop.getChicken(chicken));
    }

    @Test
    public void test2getChicken() {
        ChickenCoop coop = new ChickenCoop();
        Chicken chicken = new Chicken();
        Chicken chicken2 = new Chicken();
        coop.add(chicken); coop.add(chicken2);
        assertEquals(chicken, coop.getChicken(chicken));
        assertEquals(chicken2, coop.getChicken(chicken2));
    }

    @Test
    public void test1getChickenByName() {
        ChickenCoop chickenCoop = new ChickenCoop();
        assertNull(chickenCoop.getByName("Penny"));
    }

    @Test
    public void test2getChickenByName() {
        ChickenCoop chickenCoop = new ChickenCoop();
        Chicken chicken = new Chicken();
        chicken.setName("Penny");
        chickenCoop.add(chicken);
        Chicken actual = chickenCoop.getByName("Penny");
        assertEquals(chicken, actual);
    }

    @Test
    public void test1removeChicken() {
        ChickenCoop chickenCoop = new ChickenCoop();
        Chicken chicken = new Chicken();
        chickenCoop.add(chicken);
        assertEquals(1, chickenCoop.getNumOfChickens());
        chickenCoop.remove(chicken);
        assertEquals(0, chickenCoop.getNumOfChickens());
    }

    @Test
    public void test2removeChicken() {
        ChickenCoop chickenCoop = new ChickenCoop();
        Chicken chicken = new Chicken();
        chicken.setName("Penny");
        chickenCoop.add(chicken);
        assertEquals(1, chickenCoop.getNumOfChickens());
        chickenCoop.remove("Penny");
        assertEquals(0, chickenCoop.getNumOfChickens());
    }

    @Test
    public void test1getNumOfChickens() {
        ChickenCoop chickenCoop = new ChickenCoop();
        assertEquals(0, chickenCoop.getNumOfChickens());
    }

    @Test
    public void test2getNumOfChickens() {
        ChickenCoop chickenCoop = new ChickenCoop();
        chickenCoop.add(new Chicken());
        chickenCoop.add(new Chicken());
        assertEquals(2, chickenCoop.getNumOfChickens());
    }

    @Test
    public void test3getNumOfChickens() {
        ChickenCoop coop1 = new ChickenCoop();
        ChickenCoop coop2 = new ChickenCoop();
        ChickenCoop coop3 = new ChickenCoop();
        coop1.add(new Chicken());
        coop2.add(new Chicken());
        coop2.add(new Chicken());
        coop3.add(new Chicken());
        coop3.add(new Chicken());
        coop3.add(new Chicken());
        assertEquals(1, coop1.getNumOfChickens());
        assertEquals(2, coop2.getNumOfChickens());
        assertEquals(3, coop3.getNumOfChickens());
    }

    @Test
    public void test1clearCoop() {
        ChickenCoop coop = new ChickenCoop();
        coop.add(new Chicken());
        coop.add(new Chicken());
        assertEquals(2, coop.getNumOfChickens());
        coop.clearCoop();
        assertEquals(0, coop.getNumOfChickens());
    }

}