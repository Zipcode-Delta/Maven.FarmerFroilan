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
        return this.beingRidden;
    }

    @Override
    public int eat() {
        CornStalk earCorn = new CornStalk();
        earCorn.setNumberOfEdibleCrops(earCorn.getNumberOfEdibleCrops()-30);
        return 0;
    }



    // @Override
    //    public void eat("Edible Food") {
    //        System.out.println("Horse is eating");
    //    }
}
