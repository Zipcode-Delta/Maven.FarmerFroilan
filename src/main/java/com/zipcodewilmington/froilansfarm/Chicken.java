package com.zipcodewilmington.froilansfarm;

public class Chicken extends Animal implements Produce {
    @Override
    public String makeNoise() {
        return "";
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