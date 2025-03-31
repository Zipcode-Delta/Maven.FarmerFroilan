package com.zipcodewilmington.froilansfarm;

public class Horse extends Animal implements Rideable, NoiseMaker{
    private boolean beingRidden;
    //private List<Edible> foodEaten;

    public Horse() {
        this.beingRidden = false;
        //this.foodEaten = new ArrayList<>();
    }


    @Override
    public String makeNoise() {
        return "Neigh";
    }

    @Override
    public boolean ride() {
        this.beingRidden = true;
        return false;
    }
public void dismount() {
        this.beingRidden = false;
}
public boolean isBeingRidden() {
        return beingRidden;
}
   // @Override
    //    public void eat("Edible Food") {
    //        System.out.println("Horse is eating");
    //    }
}
