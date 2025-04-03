package com.zipcodewilmington.froilansfarm;

public class CropDuster extends FarmVehicle implements AirCraft{
    //CropRow cropRow = new CropRow();

    @Override
    public String makeNoise() {
        return "Hum roar hum roar";
    }

    @Override
    public String fly() {
        System.out.println("Fertilizing...");
        return "Fertilizing...";
    }

    @Override
    public boolean ride() {
        return true;
    }

    public String fertilizeCrops(CropRow cropRow){

        return "Fertilizing crop rows...";
    }
}
