package com.zipcodewilmington.froilansfarm;

public class Pilot extends Person {

    @Override
    public int eat() {
        Crop tomato = new TomatoPlant();
        Crop earCorn = new CornStalk();
        Chicken edibleEggs = new Chicken();
        tomato.setNumberOfEdibleCrops(tomato.getNumberOfEdibleCrops()-1);
        earCorn.setNumberOfEdibleCrops(earCorn.getNumberOfEdibleCrops()-2);
        edibleEggs.setNumOfEdibleEggs(edibleEggs.getNumOfEdibleEggs()-2);
        return super.eat();
    }

    @Override
    public String makeNoise() {
        return "";
    }

    @Override
    public String mount() {
        if (this.getName().equals("Pilot")) {
            return "Mounting Crop Duster";
        }
        return "Unable to mount Crop Duster";
    }

    @Override
    public String dismount() {
        if (this.getName().equals("Pilot")){
            return "Dismounting cropDuster";
        }
        return "Not allowed to mount Crop Duster";
    }
}
