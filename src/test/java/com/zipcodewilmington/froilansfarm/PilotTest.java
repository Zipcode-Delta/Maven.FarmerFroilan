package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PilotTest {
    @Test
    public void TestGetAndSetName() {
        Person pilot = new Pilot();
        pilot.setName("Froilan");

        String expectedName = "Froilan";

        Assert.assertEquals(expectedName, pilot.getName());
    }

    @Test
    public void TestGetAndSetName1() {
        Person farmer = new Farmer();
        farmer.setName("Froilanda");

        String expectedName = "Froilanda";

        Assert.assertEquals(expectedName, farmer.getName());
    }

    @Test
    public void TestMount(){
        Person pilot = new Pilot();
        pilot.setName("Pilot");

        String expected = "Unable to mount Crop Duster";

        Assert.assertEquals(expected, pilot.mount("Pilot"));
    }

    @Test
    public void TestMount2(){
        Person pilot = new Pilot();
        pilot.setName("Farmer");

        String expected = "Mounting tractor";

        Assert.assertNotEquals(expected, pilot.mount("Farmer"));
    }

    @Test
    public void TestDismount(){
        Person pilot = new Pilot();
        pilot.setName("Pilot");

        String expected = "Dismounting cropDuster";

        Assert.assertEquals(expected, pilot.dismount("Farmer"));
    }

    @Test
    public void TestDismount2(){
        Person pilot = new Pilot();
        pilot.setName("Farmer");

        String expected = "Mounting tractor";

        Assert.assertNotEquals(expected, pilot.dismount("Farmer"));
    }

    @Test
    public void TestDismount3(){
        Person pilot = new Pilot();
        pilot.setName("Farmer");

        String expected = "Not allowed to mount tractor";

        Assert.assertNotEquals(expected, pilot.dismount("Farmer"));
    }

}