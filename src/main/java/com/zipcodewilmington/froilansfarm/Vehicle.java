package com.zipcodewilmington.froilansfarm;

public class Vehicle implements Rideable, NoiseMaker{
    private String type;
    @Override
    public String makeNoise() {
        return "";
    }

    @Override
    public boolean ride() {
        return false;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
