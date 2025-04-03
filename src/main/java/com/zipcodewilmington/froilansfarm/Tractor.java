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

        if (crop.getName().equals("tomato")){
            crop.setNumberOfEdibleCrops(15);
        }
        crop.setNumberOfEdibleCrops(100);

        return crop.getNumberOfEdibleCrops();
    }


}
