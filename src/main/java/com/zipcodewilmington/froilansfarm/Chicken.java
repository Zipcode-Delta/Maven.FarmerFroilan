package com.zipcodewilmington.froilansfarm;

public class Chicken extends Animal implements Produce {
    private int numOfEdibleEggs;

    public Chicken(){
    }

    public Chicken(int number){
        this.numOfEdibleEggs += number;
    }


    public int getNumOfEdibleEggs() {
        return numOfEdibleEggs;
    }

    public void setNumOfEdibleEggs(int numOfEdibleEggs) {
        this.numOfEdibleEggs += numOfEdibleEggs;
    }

    @Override
    public String makeNoise() {
        return "";
    }

    @Override
    public int yield() {
        return getNumOfEdibleEggs();
    }

    @Override
    public boolean hasBeenFertilized() {
        return true;
    }


}