package com.zipcodewilmington.froilansfarm;

public class Farmer extends Person implements Botanist{
    Tractor tractor = new Tractor();
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
        Farm farm = new Farm();
        farm.updateSpectator("Farmer Plants 3 rows of crops ");
        return "";
    }

    @Override
    public String mount(String name) {
        tractor.harvestCrops(new Crop("tomato"));
        tractor.harvestCrops(new Crop("earCorn"));
        if (this.getName().equals("Farmer")){
            return "Mounting tractor";
        }

        return "unable to mount Crop Duster";
    }

    @Override
    public String dismount(String name) {
        if (this.getName().equals("Farmer")){
            return "Dismounting tractor";
        }
        return "unable to mount Crop Duster";
    }


}
