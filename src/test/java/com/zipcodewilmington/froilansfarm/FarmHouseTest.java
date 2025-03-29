package com.zipcodewilmington.froilansfarm;

import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
import com.zipcodewilmington.froilansfarm.Person;
import com.zipcodewilmington.froilansfarm.Shelter;
import com.zipcodewilmington.froilansfarm.FarmHouse;
import org.junit.jupiter.api.Test;
import java.util.Collection;

class FarmHouseTest {

    @BeforeEach
    void setUp() {
        FarmHouse.clear();
        FarmHouse farmHouseTest = new FarmHouse();
    }

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
        
    }

    @Test
    public void test2addPerson() {
        //test that a person can be added after being constructed
    }

    @Test
    public void test3addPerson() {
        //test that a Person constructed with the generic Eater can be added
    }

    @Test
    public void test1getPersonByName() {
        //test that a non-existent person cannot be returned
    }

    @Test
    public void test2getPersonByName() {
        //check that a person that does exist can be returned
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