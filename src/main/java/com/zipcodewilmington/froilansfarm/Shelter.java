package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;
import java.util.List;

public class Shelter<LivingThings extends Eater> {
    private volatile List<LivingThings> shelter = new ArrayList<>();
}
