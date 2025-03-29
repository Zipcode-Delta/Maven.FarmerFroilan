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
    public void testArgsConstructor() {
        //make sure that if an arrayList is passed
        //as an arg thru the constructor
        //the farmHouse will take the list
        //as the contents of the farmHouse
        //may not need this either
    }

    @Test
    public void test1addPerson() {
        FarmHouse farmHouseTest = new FarmHouse();
        Farmer person = new Farmer();
        farmHouseTest.add(person);
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
        //test that a Person can be removed
    }

    @Test
    public void test2removePerson() {
        //test that a Person can be removed by name
    }

    @Test
    public void test1getNumOfPeople() {
        int expected = 0;
    }

    @Test
    public void test2getNumOfPeople() {
        //test that the correct number is returned
        //as people are added to the farmhouse
    }

}