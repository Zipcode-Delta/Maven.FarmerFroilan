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
    Horse horse1 = new Horse("horse1"); Horse horse2 = new Horse("horse2");
    Horse horse3 = new Horse("horse3"); Horse horse4 = new Horse("horse4");
    Horse horse5 = new Horse("horse5"); Horse horse6 = new Horse("horse6");
    Horse horse7 = new Horse("horse7"); Horse horse8 = new Horse("horse8");
    Horse horse9 = new Horse("horse9"); Horse horse10 = new Horse("horse10");
    Chicken chicken1 = new Chicken(); Chicken chicken2 = new Chicken();
    Chicken chicken3 = new Chicken(); Chicken chicken4 = new Chicken();
    Chicken chicken5 = new Chicken(); Chicken chicken6 = new Chicken();
    Chicken chicken7 = new Chicken(); Chicken chicken8 = new Chicken();
    Chicken chicken9 = new Chicken(); Chicken chicken10 = new Chicken();
    Chicken chicken11 = new Chicken(); Chicken chicken12 = new Chicken();
    Chicken chicken13 = new Chicken(); Chicken chicken14 = new Chicken();
    Chicken chicken15 = new Chicken();
    CropRow tomatoRow = new CropRow();
    CropRow earCornRow = new CropRow();
    CropRow yamsRow1 = new CropRow();
    CropRow yamsRow2 = new CropRow();
    CropRow yamsRow3 = new CropRow();
    Crop tomato = new TomatoPlant("tomato");
    Crop earCorn = new CornStalk("earCorn");




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
        field.addToCropRows(tomatoRow);
        field.addToCropRows(earCornRow);
        field.addToCropRows(yamsRow1);
        field.addToCropRows(yamsRow2);
        field.addToCropRows(yamsRow3);
        tomato.setNumberOfEdibleCrops(10);
        earCorn.setNumberOfEdibleCrops(100);
    }

    public void runFarm() {
        setUp();
        sundayRoutine();
        mondayRoutine();
        tuesdayRoutine();
        wednesdayRoutine();
        thursdayRoutine();
        fridayRoutine();
        saturdayRoutine();
    }

    public void updateSpectator(String string) {
        System.out.println(string);
    }

    public void sundayRoutine() {
        updateSpectator("Today is Sunday");
        morningRoutine();
        //froilan plants crops, 3 different types in 3 different CropRows
        froilan.plant();
    }

    public void mondayRoutine() {
        updateSpectator("Today is Monday");
        morningRoutine();
        //froilanda uses the CropDuster to fertilize the CropRows in the Field
        froilanda.mount(froilanda.getName());

        //write out the effects of mounting cropduster and then dismounts
        froilanda.dismount(froilanda.getName());
    } //make test class

    public void tuesdayRoutine() {
        updateSpectator("Today is Tuesday");
        morningRoutine();
        //froilan uses the Tractor to harvest the crops
        froilan.mount(froilan.getName());
        //Continue process that happens when tractor is mounted.
        froilan.dismount(froilan.getName());
    } //make test class

    public void wednesdayRoutine() {
        updateSpectator("Today is Wednesday");
        morningRoutine();
        //additional routines TBD
        froilan.plant();
    } //make test class?

    public void thursdayRoutine() {
        updateSpectator("Today is Thursday");
        morningRoutine();
        //additional routines TBD
        froilanda.mount(froilanda.getName());
        //write effects of cropduster, then dismount
        froilanda.dismount(froilanda.getName());
    } //make test class?

    public void fridayRoutine() {
        updateSpectator("Today is Friday");
        morningRoutine();
        //additional routines TBD
        froilan.mount(froilan.getName());
        //continue process that happens when tractor is mounted
        froilan.dismount(froilan.getName());
    } //make test class?

    public void saturdayRoutine() {
        updateSpectator("Today is Saturday");
        morningRoutine();
        //additional routines TBD
    } //make test class?

    public void morningRoutine() {
        updateSpectator(froilan.getName() + " and " + froilanda.getName() + " ride all 10 horses");
        rideHorse();
        feedHorse();
        eatBreakfast();
        //do we want to harvest chicken eggs daily? every other day?
    }

    public boolean feedHorse() {
        int numberOfCornFed = 0;
        int horsesFed = 0;
        for (int i = 0; i < stable1.getNumOfHorses(); i++) {
            stable1.getByIndex(i).eat(earCorn);
            numberOfCornFed += 3;
            horsesFed++;
            //updateSpectator(stable1.getByIndex(i).getName() + " has been fed 3 ears of corn");
        }
        for (int i = 0; i < stable2.getNumOfHorses(); i++) {
            stable1.getByIndex(i).eat(earCorn);
            numberOfCornFed += 3;
            horsesFed++;
            //updateSpectator(stable1.getByIndex(i).getName() + " has been fed 3 ears of corn");
        }
        for (int i = 0; i < stable3.getNumOfHorses(); i++) {
            stable1.getByIndex(i).eat(earCorn);
            numberOfCornFed += 3;
            horsesFed++;
            //updateSpectator(stable1.getByIndex(i).getName() + " has been fed 3 ears of corn");
        }
        //return however much EarCorn - amt to be fed > 0?
        // number of corn set in horse eat() method?? does that need to be moved?
        if (horsesFed == 10) {
            updateSpectator("All horses were fed a total of " + numberOfCornFed + " ears of corn.");
        }
        return true;
    }

    public boolean rideHorse() {
        int horsesRidden = 0;
        for (int i = 0; i < stable1.getNumOfHorses(); i++) {
            stable1.getByIndex(i).ride();
            stable1.getByIndex(i).isBeingRidden();
            horsesRidden++;
            //updateSpectator(stable1.getByIndex(i).getName() + " ridden");
        }
        for (int i = 0; i < stable2.getNumOfHorses(); i++) {
            stable1.getByIndex(i).ride();
            stable1.getByIndex(i).isBeingRidden();
            horsesRidden++;
            //updateSpectator(stable1.getByIndex(i).getName() + " ridden");
        }
        for (int i = 0; i < stable3.getNumOfHorses(); i++) {
            stable1.getByIndex(i).ride();
            stable1.getByIndex(i).isBeingRidden();
            horsesRidden++;
            //updateSpectator(stable1.getByIndex(i).getName() + " ridden");
        }
        if (horsesRidden == 10) {
            updateSpectator("All horses have been out for a ride");
        }
        return true;
    }
    //        return what??
    // }
    public String eatBreakfast() {
        froilan.eat(earCorn, chicken1);
        froilan.eat(tomato);
        froilanda.eat(earCorn, chicken2);
        froilanda.eat(tomato);
        //System.out.println("Froilin and Froilinda have both eaten breakfast");
        return "Has eaten breakfast";
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
