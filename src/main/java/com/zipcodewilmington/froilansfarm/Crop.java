package com.zipcodewilmington.froilansfarm;

public class Crop implements Produce {


    private String name;
    private int numberOfEdibleCrops;
    public boolean harvested;


//    public Crop(String name) {
//        this.name = name;
//        this.numberOfEdibleCrops = 0;
//        this.harvested = false;
//    }

    public Crop(String name) {
        this.name = name;
    }

    public boolean harvest() {
        if (hasBeenHarvested()) {
            return this.harvested;
        }
        return !this.harvested;
    }

    public void setNumberOfEdibleCrops(int number){
        this.numberOfEdibleCrops = number;
    }

    public boolean hasBeenHarvested() {
        if (this.name.equalsIgnoreCase("EarCorn")) {
            return true;
        }
        return false;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfEdibleCrops() {
        return this.numberOfEdibleCrops;

    }

    public int removeEdibleCrops(int numberOfEdibleCrops){
        if (numberOfEdibleCrops>0){
            return this.numberOfEdibleCrops -= numberOfEdibleCrops;
        } else {
            return this.numberOfEdibleCrops;
        }

    }

    public int addEdibleCrops(int edibleCrops) {
        if (edibleCrops > 0) {
            this.numberOfEdibleCrops += edibleCrops;
        }
        return this.numberOfEdibleCrops;
    }

    @Override
    public int yield() {
        return 0;
    }

    @Override
    public boolean hasBeenFertilized() {
        addEdibleCrops(yield());
        System.out.println(getNumberOfEdibleCrops());
        return true;
    }


}


//
//        return true; //made this true from false
//    }
//
//
//    }