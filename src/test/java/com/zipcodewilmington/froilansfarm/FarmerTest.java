package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FarmerTest {
    @Test
    public void TestGetAndSetName() {
        Person farmer = new Farmer();
        farmer.setName("Froilan");

        String expectedName = "Froilan";

        Assert.assertEquals(expectedName, farmer.getName());
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
        Person farmer = new Farmer();
        farmer.setName("Pilot");

        String expected = "Mounting cropDuster";

        Assert.assertNotEquals(expected, farmer.mount("Farmer"));
    }

    @Test
    public void TestMount2(){
        Person farmer = new Farmer();
        farmer.setName("Farmer");

        String expected = "Mounting tractor";

        Assert.assertEquals(expected, farmer.mount("Farmer"));
    }

    @Test
    public void TestDismount(){
        Person farmer = new Farmer();
        farmer.setName("Pilot");

        String expected = "Mounting tractor";

        Assert.assertNotEquals(expected, farmer.dismount("Pilot"));
    }

    @Test
    public void TestDismount2(){
        Person farmer = new Farmer();
        farmer.setName("Farmer");

        String expected = "Dismounting tractor";

        Assert.assertEquals(expected, farmer.dismount("Pilot"));
    }

    @Test
    public void TestDismount3(){
        Person farmer = new Farmer();
        farmer.setName("Farmer");

        String expected = "Not allowed to mount tractor";

        Assert.assertNotEquals(expected, farmer.dismount("Farmer"));
    }
}