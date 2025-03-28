package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;

public class Shelter<LivingThings extends Eater> {
    private volatile ArrayList<LivingThings> shelter = new ArrayList<>();
}
