package com.zipcodewilmington.froilansfarm;

public class Crop implements Produce{
    @Override
    public int yield() {
        return 0;
    }

    @Override
    public boolean hasBeenFertilized() {
        return false;
    }
}
