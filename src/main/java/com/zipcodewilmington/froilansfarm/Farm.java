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
    Farmer froilan = new Farmer();
    Pilot froilanda = new Pilot();
    Horse horse1 = new Horse(); Horse horse2 = new Horse();
    Horse horse3 = new Horse(); Horse horse4 = new Horse();
    Horse horse5 = new Horse(); Horse horse6 = new Horse();
    Horse horse7 = new Horse(); Horse horse8 = new Horse();
    Horse horse9 = new Horse(); Horse horse10 = new Horse();
    Chicken chicken1 = new Chicken(); Chicken chicken2 = new Chicken();
    Chicken chicken3 = new Chicken(); Chicken chicken4 = new Chicken();
    Chicken chicken5 = new Chicken(); Chicken chicken6 = new Chicken();
    Chicken chicken7 = new Chicken(); Chicken chicken8 = new Chicken();
    Chicken chicken9 = new Chicken(); Chicken chicken10 = new Chicken();
    Chicken chicken11 = new Chicken(); Chicken chicken12 = new Chicken();
    Chicken chicken13 = new Chicken(); Chicken chicken14 = new Chicken();
    Chicken chicken15 = new Chicken();


    public void setUp() {
        froilan.setName("Froilan");
        froilanda.setName("Froilanda");
        farmHouse.add(froilan);
        farmHouse.add(froilanda);
        stable1.add(horse1); stable1.add(horse2); stable1.add(horse3); stable1.add(horse4);
        stable2.add(horse5); stable2.add(horse6); stable2.add(horse7); stable2.add(horse8);
        stable3.add(horse9); stable3.add(horse10);
        coop1.add(chicken1); coop1.add(chicken2); coop1.add(chicken3); coop1.add(chicken4);
        coop2.add(chicken5); coop2.add(chicken6); coop2.add(chicken7); coop2.add(chicken8);
        coop3.add(chicken9); coop3.add(chicken10); coop3.add(chicken11); coop3.add(chicken12);
        coop4.add(chicken13); coop4.add(chicken14); coop4.add(chicken15);
    }

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
        for (int i = 0; i < stable1.getNumOfHorses(); i++) {
            //rideHorse(stable1.getHorse())
         }
        //rideHorse(horse);
        feedHorse();
        eatBreakfast();
        //do we want to harvest chicken eggs daily? every other day?
    }

    public boolean feedHorse() {
        Horse horse = new Horse();
        Crop corn = new CornStalk();
        horse.eat();

        //return however much EarCorn - amt to be fed > 0?
        // number of corn set in horse eat() method?? does that need to be moved?

        return true;
    }

    public boolean rideHorse(Horse horse) {
       // for (int i = 0; i < stable1.getNumOfHorses(); i++) {
            horse.ride();
       // }
        return true;
    }
    //        return what??
    // }
    public String eatBreakfast() {
        Person farmer = new Farmer();
        Person pilot = new Pilot();
        farmer.eat();
        pilot.eat();
        return farmer.getName() + "Has eaten breakfast";
    }
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
