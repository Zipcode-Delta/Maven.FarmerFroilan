package com.zipcodewilmington.froilansfarm;

public class Horse extends Animal implements Rideable{
    @Override
    public String makeNoise() {
        return "Neigh";
    }

    @Override
    public boolean ride() {
        return false;
    }
}
