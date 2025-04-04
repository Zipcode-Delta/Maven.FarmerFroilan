package com.zipcodewilmington.froilansfarm;

public class Stable extends Shelter {
    private Shelter<Horse> stable = new Shelter<>();
    //does this need to be static?

    Stable() {
    }

    public void clearStable() {
        stable.clear();
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

    public Horse getHorse(Horse horse) {
        return stable.getLivingThing(horse);
    }

    public Horse getByName(String name) {
        return stable.getByName(name);
    }

    public Horse getByIndex(int index) {
        return stable.getByIndex(index);
    }
}
