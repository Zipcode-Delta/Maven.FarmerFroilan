package com.zipcodewilmington.froilansfarm;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Collection;

class FarmHouseTest {

    @Test
    public void testInstanceOf() {
        FarmHouse farmHouse = new FarmHouse();
        assertFalse(farmHouse instanceof Collection);
    }

    @Test
    public void testNullConstructor() {
        FarmHouse farmHouse = new FarmHouse();
        assertNotNull(farmHouse);
    }

    @Test
    public void test1addPerson() {
        FarmHouse farmHouseTest = new FarmHouse();
        farmHouseTest.add(new Farmer());
        assertEquals(1, farmHouseTest.getNumOfPeople());
    }

    @Test
    public void test2addPerson() {
        FarmHouse farmHouseTest = new FarmHouse();
        Pilot pilot = new Pilot();
        farmHouseTest.add(pilot);
        assertEquals(1, farmHouseTest.getNumOfPeople());
    }

    @Test
    public void test3addPerson() {
        FarmHouse farmHouseTest = new FarmHouse();
        Person person1 = new Farmer();
        Person person2 = new Pilot();
        farmHouseTest.add(person1);
        farmHouseTest.add(person2);
        assertEquals(2, farmHouseTest.getNumOfPeople());
    }

    @Test
    public void test1getPerson() {
        FarmHouse farmHouseTest = new FarmHouse();
        Person person1 = new Farmer();
        farmHouseTest.add(person1);
        assertEquals(person1, farmHouseTest.getPerson(person1));
    }

    @Test
    public void test2getPerson() {
        FarmHouse farmHouseTest = new FarmHouse();
        Person farmer = new Farmer();
        Person pilot = new Pilot();
        farmHouseTest.add(farmer); farmHouseTest.add(pilot);
        assertEquals(farmer, farmHouseTest.getPerson(farmer));
        assertEquals(pilot, farmHouseTest.getPerson(pilot));
    }

    @Test
    public void test1getPersonByIndex() {
        FarmHouse farmHouseTest = new FarmHouse();
        Person person1 = new Farmer();
        farmHouseTest.add(person1);
        assertEquals(person1, farmHouseTest.getByIndex(0));
    }

    @Test
    public void test2getPersonByIndex() {
        FarmHouse farmHouseTest = new FarmHouse();
        Person farmer = new Farmer();
        Person pilot = new Pilot();
        farmHouseTest.add(farmer); farmHouseTest.add(pilot);
        assertEquals(farmer, farmHouseTest.getByIndex(0));
        assertEquals(pilot, farmHouseTest.getByIndex(1));
    }

    @Test
    public void test1getNumOfPeople() {
        FarmHouse farmHouseTest = new FarmHouse();
        int expected = 0;
        int actual = farmHouseTest.getNumOfPeople();
        assertEquals(expected, actual);
    }

    @Test
    public void test2getNumOfPeople() {
        FarmHouse farmHouseTest = new FarmHouse();
        Person farmer = new Farmer();
        Person pilot = new Pilot();
        farmHouseTest.add(farmer);
        farmHouseTest.add(pilot);
        int expected = 2;
        int actual = farmHouseTest.getNumOfPeople();
        assertEquals(expected, actual);
    }

    @Test
    public void test1getPersonByName() {
        FarmHouse farmHouseTest = new FarmHouse();
        assertNull(farmHouseTest.getByName("Frank"));
    }

    @Test
    public void test2getPersonByName() {
        FarmHouse farmHouseTest = new FarmHouse();
        Person person = new Farmer();
        farmHouseTest.add(person);
        person.setName("Froilan");
        Person actual = farmHouseTest.getByName("Froilan");
        assertEquals(person, actual);
    }

    @Test
    public void test3getPersonByName() {
        FarmHouse farmHouseTest = new FarmHouse();
        Person person = new Pilot();
        farmHouseTest.add(person);
        person.setName("Froilanda");
        Person actual = farmHouseTest.getByName("Froilanda");
        assertEquals(person, actual);
    }

    @Test
    public void test1removePerson() {
        FarmHouse farmHouseTest = new FarmHouse();
        Person person = new Farmer();
        farmHouseTest.add(person);
        assertEquals(1, farmHouseTest.getNumOfPeople());
        farmHouseTest.remove(person);
        assertEquals(0, farmHouseTest.getNumOfPeople());
    }

    @Test
    public void test2removePerson() {
        FarmHouse farmHouseTest = new FarmHouse();
        Person person = new Pilot();
        person.setName("Frank");
        farmHouseTest.add(person);
        assertEquals(1, farmHouseTest.getNumOfPeople());
        farmHouseTest.remove("Frank");
        assertEquals(0, farmHouseTest.getNumOfPeople());
    }

    @Test
    public void test1clearFarmHouse() {
        FarmHouse farmHouseTest = new FarmHouse();
        Person person = new Pilot();
        farmHouseTest.add(person);
        assertEquals(1, farmHouseTest.getNumOfPeople());
        farmHouseTest.clearFarmHouse();
        assertEquals(0, farmHouseTest.getNumOfPeople());
    }

}