package com.zipcodewilmington.froilansfarm;

public class Farmer extends Person implements Botanist{
    Tractor tractor = new Tractor();
    @Override
    public int eat(Crop crop, Chicken edibleEggs) {
        if (crop.getName().equals("tomato")){
            crop.removeEdibleCrops(2);
        } else if (crop.getName().equals("earCorn")){
            crop.removeEdibleCrops(1);
        }
        edibleEggs.setNumOfEdibleEggs(edibleEggs.getNumOfEdibleEggs());
        return 0;
    }


    @Override
    public int eat(Crop crop) {
        if (crop.getName().equals("tomato")){
            crop.removeEdibleCrops(2);
        } else if (crop.getName().equals("earCorn")){
            crop.removeEdibleCrops(1);
        }
        return 0;
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
