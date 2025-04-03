package com.zipcodewilmington.froilansfarm;

public class CropDuster extends FarmVehicle implements AirCraft{
    //CropRow cropRow = new CropRow();

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
        return 5;
    }
}
