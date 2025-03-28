package com.zipcodewilmington.froilansfarm;

public class FarmHouse {
    private static Shelter<Person> farmhouse = new Shelter<>();
    //does this need to be static?
    //do all the methods need to be static?

    public static void clear() {
        farmhouse.clear();
    }

    public static int getNumOfPeople() {
        return farmhouse.getNumberOfThings();
    }

    public static void add(Person person) {
        farmhouse.add(person);
    }

    public static void remove(Person person) {
        farmhouse.removeThing(person);
    }

//    public static void remove(String name) {
//        farmhouse.removeByName(name);
//    }

//    public static Person getByName(String name) {
//        return farmhouse.getByName(name);
//    }

}
