package com.zipcodewilmington.froilansfarm;

public class TomatoPlant extends Crop{

    public TomatoPlant(String name) {
        super(name);
    }

    public TomatoPlant() {
        this.setNumberOfEdibleCrops(30);
    }

    @Override
    public void setName(String name) {
        setName("tomato");
    }
}
