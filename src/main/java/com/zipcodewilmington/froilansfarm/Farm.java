package com.zipcodewilmington.froilansfarm;

public class Farm {
    FarmHouse farmHouse;
    Stable stable1;
    Stable stable2;
    Stable stable3;
    ChickenCoop coop1;
    ChickenCoop coop2;
    ChickenCoop coop3;
    ChickenCoop coop4;
    Field field;

    Farm() {
        this.farmHouse = new FarmHouse();
        this.stable1 = new Stable();
        this.stable2 = new Stable();
        this.stable3 = new Stable();
        this.coop1 = new ChickenCoop();
        this.coop2 = new ChickenCoop();
        this.coop3 = new ChickenCoop();
        this.coop4 = new ChickenCoop();
        this.field = new Field();
    }

    /*
    will need methods for:
    sundayRoutine();  schedule given
    mondayRoutine();  schedule given
    tuesdayRoutine();  schedule given
    wednesdayRoutine();
    thursdayRoutine();
    fridayRoutine();
    saturdayRoutine();
    morningRoutine();  used every morning, regardless of day
    feedHorse();  part of morning routine
    rideHorse();  part of morning routine
    eatBreakfast();  part of morning routine

    should we have a method that sets up the farm,
    creates the Person, Horse, and Chicken objects and adds them to the shelters?
    are these returning void? should feedHorse() return the new amount of EarCorn left?
    can eatBreakfast() be a boolean that returns true after it's completed?
    can rideHorse() also be a boolean to confirm that each horse is rode each day?
     */
}
