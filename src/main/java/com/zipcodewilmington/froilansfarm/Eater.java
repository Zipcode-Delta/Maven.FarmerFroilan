package com.zipcodewilmington.froilansfarm;

public abstract class Eater implements NoiseMaker{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public  int eat(Crop crop){
        return 0;
    }
}
