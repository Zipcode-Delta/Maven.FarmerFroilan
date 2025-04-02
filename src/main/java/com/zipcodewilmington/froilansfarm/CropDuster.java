package com.zipcodewilmington.froilansfarm;

public class CropDuster extends FarmVehicle implements AirCraft{

    @Override
    public String makeNoise() {
        return "Hum roar hum roar";
    }

    @Override
    public String fly() {
        return "Fertilizing...";
    }

    @Override
    public boolean ride() {
        return true;
    }

    public int fertilizeCrops(CropRow cropRow){
        return cropRow.getNumOfCrops();
    }
}
