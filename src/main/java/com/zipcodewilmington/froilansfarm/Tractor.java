package com.zipcodewilmington.froilansfarm;

public class Tractor extends FarmVehicle{

    @Override
    public String makeNoise() {
        return "PUH PUH PUH PUH";
    }

    @Override
    public boolean ride() {
        return super.ride();
    }

    public int harvestCrops(Crop crop){
        return 0;
    }

}
