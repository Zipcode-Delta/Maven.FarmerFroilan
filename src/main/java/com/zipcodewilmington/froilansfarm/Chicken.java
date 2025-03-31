package com.zipcodewilmington.froilansfarm;

public class Chicken extends Animal implements Produce {
    private int numOfEdibleEggs = 4;

    public Chicken() {

    }

    @Override
    public String makeNoise() {
        return "Cluck cluck";
    }

    @Override
    public int yield() {
        if (!hasBeenFertilized()){
            return numOfEdibleEggs + 1;
        }
        return numOfEdibleEggs;
    }

    @Override
    public boolean hasBeenFertilized() {
        return true;
    }


}