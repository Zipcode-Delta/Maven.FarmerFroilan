package com.zipcodewilmington.froilansfarm;

import java.util.Random;

public class Chicken extends Animal implements Produce {
    private int numOfEdibleEggs = 4;

    double rand = Math.ceil(Math.random()*2);

    public Chicken() {

    }

    public int getNumOfEdibleEggs() {
        return numOfEdibleEggs;
    }

    public void setNumOfEdibleEggs(int numOfEdibleEggs) {
        this.numOfEdibleEggs += numOfEdibleEggs;
    }

    @Override
    public String makeNoise() {
        return "Cluck cluck";
    }

    @Override
    public int yield() {
        if (hasBeenFertilized()){
            System.out.println("Chicken has been fertilized");
            return numOfEdibleEggs;
        } else{
            System.out.println("Chicken was not been fertilized. You have edible eggs");
            numOfEdibleEggs += 1;
            return numOfEdibleEggs;
        }
    }

    @Override
    public boolean hasBeenFertilized() {
        int rand = (int) Math.ceil(Math.random()*2);
        System.out.println(rand);
        return rand == 1;

    }


}