package com.zipcodewilmington.froilansfarm;

public class Farm {
    FarmHouse farmHouse = new FarmHouse();
    Stable stable1 = new Stable();
    Stable stable2 = new Stable();
    Stable stable3 = new Stable();
    ChickenCoop coop1 = new ChickenCoop();
    ChickenCoop coop2 = new ChickenCoop();
    ChickenCoop coop3 = new ChickenCoop();
    ChickenCoop coop4 = new ChickenCoop();
    Field field = new Field();

    void runFarm() {

    }

    public void sundayRoutine() {
        morningRoutine();
        //froilan plants crops, 3 different types in 3 different CropRows
    }

    public void mondayRoutine() {
        morningRoutine();
        //froilanda uses the CropDuster to fertilize the CropRows in the Field
    }

    public void tuesdayRoutine() {
        morningRoutine();
        //froilan uses the Tractor to harvest the crops
    }

    public void wednesdayRoutine() {
        morningRoutine();
        //additional routines TBD
    }

    public void thursdayRoutine() {
        morningRoutine();
        //additional routines TBD
    }

    public void fridayRoutine() {
        morningRoutine();
        //additional routines TBD
    }

    public void saturdayRoutine() {
        morningRoutine();
        //additional routines TBD
    }

    public void morningRoutine() {
//        feedHorse();
//        rideHorse();
//        eatBreakfast();
        //do we want to harvest chicken eggs daily? every other day?
    }

    public boolean feedHorse() {
        //return however much EarCorn - amt to be fed > 0?
        return false;
    }

    //- rideHorse() {
    //        return what??
    // }
    //- eatBreakfast() {
    //    subtract from totals for edible crops, return true if all values ?
    // }
    /*
    should we have a method that sets up the farm,
    creates the Person, Horse, and Chicken objects and adds them to the shelters?
    are these returning void? should feedHorse() return the new amount of EarCorn left?
    can eatBreakfast() be a boolean that returns true after it's completed?
    can rideHorse() also be a boolean to confirm that each horse is rode each day?
     */
}
