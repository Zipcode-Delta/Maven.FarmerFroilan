package com.zipcodewilmington.froilansfarm;

public class Vehicle implements Rideable, NoiseMaker{
    @Override
    public String makeNoise() {
        return "";
    }

    @Override
    public boolean ride() {
        return false;
    }
}
