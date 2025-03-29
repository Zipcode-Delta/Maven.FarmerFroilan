package com.zipcodewilmington.froilansfarm;

import static org.junit.jupiter.api.Assertions.*;
import com.zipcodewilmington.froilansfarm.Person;
import com.zipcodewilmington.froilansfarm.Shelter;
import com.zipcodewilmington.froilansfarm.FarmHouse;
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
        Person person = new Farmer();
        farmHouseTest.add(person);
        person.setName("Froilan");
        Person actual = farmHouseTest.getByName("Froilan");
        assertEquals(person, actual);
    }

    @Test
    public void test2getPersonByName() {
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
        farmHouseTest.clear();
        assertEquals(0, farmHouseTest.getNumOfPeople());
    }

}