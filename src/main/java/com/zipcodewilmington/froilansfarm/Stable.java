package com.zipcodewilmington.froilansfarm;

public class Stable {
    private Shelter<Horse> stable = new Shelter<>();
    //does this need to be static?

    Stable() {
    }

    public int getNumOfHorses() {
        return stable.getNumberOfThings();
    }

    public void add(Horse horse) {
        stable.add(horse);
    }

    public void remove(Horse horse) {
        stable.removeThing(horse);
    }

    public void remove(String name) {
        stable.removeByName(name);
    }

    public Horse getByName(String name) {
        return stable.getByName(name);
    }
}
