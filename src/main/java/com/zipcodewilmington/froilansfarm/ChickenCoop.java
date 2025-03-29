package com.zipcodewilmington.froilansfarm;

public class ChickenCoop {
    private Shelter<Chicken> chickenCoop = new Shelter<>();
    //does this need to be static?

    ChickenCoop() {
    }

    public void clearCoop() {
        chickenCoop.clear();
    }

    public int getNumOfChickens() {
        return chickenCoop.getNumberOfThings();
    }

    public void add(Chicken chicken) {
        chickenCoop.add(chicken);
    }

    public void remove(Chicken chicken) {
        chickenCoop.removeThing(chicken);
    }

    public void remove(String name) {
        chickenCoop.removeByName(name);
    }

    public Chicken getByName(String name) {
        return chickenCoop.getByName(name);
    }


}
