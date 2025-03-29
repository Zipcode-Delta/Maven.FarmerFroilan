package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;
import java.util.List;

public class Shelter<LivingThings extends Eater> {
    private volatile List<LivingThings> shelter = new ArrayList<>();

    public Shelter() {}

    public void clear() {
        shelter.clear();
    }

    public int getNumberOfThings() {
        return shelter.size();
    }

    public void add(LivingThings obj) {
        shelter.add(obj);
    }

    public void removeThing(LivingThings obj) {
        shelter.remove(obj);
    }

    public void removeByName(String name) {
        shelter.remove(getByName(name));
    }

    public LivingThings getByName(String name) {
        for (LivingThings obj : shelter) {
            if (obj.getName().equals(name)) {
                return obj;
            }
        }
        return null;
    }

}
