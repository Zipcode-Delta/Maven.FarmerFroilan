package com.zipcodewilmington.froilansfarm;

public class CropRow {
    private int numOfCrops;
    public CropRow() {
        this.numOfCrops = 0;
    }

    public int getNumOfCrops() {
        return numOfCrops;
    }

    public void setNumOfCrops(int numOfCrops) {
        this.numOfCrops = numOfCrops;
    }

    public void addCrops(int crops) {
        this.numOfCrops += crops;
    }
}
