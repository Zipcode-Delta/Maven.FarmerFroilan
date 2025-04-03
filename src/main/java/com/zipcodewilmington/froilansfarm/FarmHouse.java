package com.zipcodewilmington.froilansfarm;

public class FarmHouse {
    private Shelter<Person> farmhouse = new Shelter<>();
    //does this need to be static?
    //do all the methods need to be static?

    public void clearFarmHouse() {
        farmhouse.clear();
    }

    public int getNumOfPeople() {
        return farmhouse.getNumberOfThings();
    }

    public void add(Person person) {
        farmhouse.add(person);
    }

    public void remove(Person person) {
        farmhouse.removeThing(person);
    }

    public void remove(String name) {
        farmhouse.removeByName(name);
    }

    public Person getPerson(Person person) {
        return farmhouse.getLivingThing(person);
    }

    public Person getByName(String name) {
        return farmhouse.getByName(name);
    }

}
