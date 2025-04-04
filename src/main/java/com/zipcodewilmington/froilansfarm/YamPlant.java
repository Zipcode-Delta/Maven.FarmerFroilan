package com.zipcodewilmington.froilansfarm;

public class YamPlant extends Crop{
    public YamPlant(String name) {
        super(name);
    }

    @Override
    public void setNumberOfEdibleCrops(int number) {
        super.setNumberOfEdibleCrops(number);
    }

    @Override
    public void setName(String name) {
        setName("yamPlant");
    }
}
