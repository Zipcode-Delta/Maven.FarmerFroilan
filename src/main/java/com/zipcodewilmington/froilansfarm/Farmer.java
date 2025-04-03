package com.zipcodewilmington.froilansfarm;

public class Farmer extends Person implements Botanist{


    @Override
    public int eat() {
        Crop tomato = new TomatoPlant();
        Crop earCorn = new CornStalk();
        Chicken edibleEggs = new Chicken();
        tomato.setNumberOfEdibleCrops(tomato.getNumberOfEdibleCrops()-2);
        earCorn.setNumberOfEdibleCrops(earCorn.getNumberOfEdibleCrops()-1);
        edibleEggs.setNumOfEdibleEggs(edibleEggs.getNumOfEdibleEggs()-5);
        return super.eat();
    }


    @Override
    public String makeNoise() {
        return "";
    }

    @Override
    public String plant() {
        return "";
    }

    @Override
    public String mount() {
        if (this.getName().equals("Farmer")){
            return "Mounting tractor";
        }

        return "unable to mount Crop Duster";
    }

    @Override
    public String dismount() {
        if (this.getName().equals("Farmer")){
            return "Dismounting tractor";
        }
        return "unable to mount Crop Duster";
    }


}
