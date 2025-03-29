package com.zipcodewilmington.froilansfarm;

public class Stable {
    private static Shelter<Horse> stable = new Shelter<>();
    //does this need to be static?

    public static void clear() {
        stable.clear();
    }

    public static int getNumOfHorses() {
        return stable.getNumberOfThings();
    }

    public static void add(Horse horse) {
        stable.add(horse);
    }

    public static void remove(Horse horse) {
        stable.removeThing(horse);
    }

    public static void remove(String name) {
        stable.removeByName(name);
    }

    public static Horse getByName(String name) {
        return stable.getByName(name);
    }
}
