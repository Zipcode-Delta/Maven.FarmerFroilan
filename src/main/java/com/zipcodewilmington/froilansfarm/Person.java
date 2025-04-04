package com.zipcodewilmington.froilansfarm;

public abstract class Person extends Eater implements Rider {
    public abstract String mount(String name);

    @Override
    public int eat(Crop crop, Chicken edibleEggs) {
        return super.eat(crop, edibleEggs);
    }
}
