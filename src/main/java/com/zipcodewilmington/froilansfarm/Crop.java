package com.zipcodewilmington.froilansfarm;

public class Crop implements Produce {


    private String name;
    private int numberOfEdibleCrops;
    public boolean harvested;

    public Crop(String name) {
        this.name = name;
        this.numberOfEdibleCrops = 0;
        this.harvested = false;
    }

    public Crop() {
    }

    public boolean harvest() {
        if (hasBeenHarvested()) {
            return this.harvested;
        }
        return !this.harvested;
    }

    public void setNumberOfEdibleCrops(int number){
        this.numberOfEdibleCrops += number;
    }

    public boolean hasBeenHarvested() {
        if (this.name.equalsIgnoreCase("EarCorn")) {
            return true;
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfEdibleCrops() {
        return numberOfEdibleCrops;
        //if (NumberOfEdibleCrops>0)
        // return edibleCrops;
    }

    public int addEdibleCrops(int edible) {

        if (edible > 0) {
            numberOfEdibleCrops += edible;
        }
        return numberOfEdibleCrops;
    }

    @Override
    public int yield() {
        return 0;
    }

    @Override
    public boolean hasBeenFertilized() {
        return true;
    }


}


//
//        return true; //made this true from false
//    }
//
//
//    }