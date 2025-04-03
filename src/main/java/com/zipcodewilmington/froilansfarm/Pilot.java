package com.zipcodewilmington.froilansfarm;

public class Pilot extends Person {
    CropDuster cropDuster = new CropDuster();
    CropRow cropRow = new CropRow();

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
    public String mount(String name) {
        System.out.println(name + " Mounted CropDuster");
        cropDuster.ride();
        cropDuster.fly();
        cropDuster.fertilizeCrops(cropRow);
        if (this.getName().equals("froilinda")) {
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
