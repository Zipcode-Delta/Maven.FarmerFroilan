package com.zipcodewilmington.froilansfarm;

public class Pilot extends Person {
    CropDuster cropDuster = new CropDuster();
    CropRow cropRow = new CropRow();

    @Override
    public int eat(Crop crop, Chicken edibleEggs) {
        if (crop.getName().equals("tomato")){
            crop.removeEdibleCrops(1);
        } else if (crop.getName().equals("earCorn")){
            crop.removeEdibleCrops(2);
        }
        edibleEggs.setNumOfEdibleEggs(edibleEggs.getNumOfEdibleEggs()-2);
        return 0;
    }

    @Override
    public int eat(Crop crop) {
        if (crop.getName().equals("tomato")){
            crop.removeEdibleCrops(1);
        } else if (crop.getName().equals("earCorn")){
            crop.removeEdibleCrops(2);
        }
        return 0;
    }

    @Override
    public String makeNoise() {
        return "dchu dchu dchu dchu";
    }

    @Override
    public String mount(String name) {
        System.out.println(name + " Mounted CropDuster");
        cropDuster.ride();
        System.out.println(cropDuster.makeNoise());
        cropDuster.fly();
        cropDuster.fertilizeCrops(cropRow);
        if (this.getClass() == Pilot.class) {
            return "Mounting Crop Duster";
        }
        return "Unable to mount Crop Duster";
    }

    @Override
    public String dismount(String name) {
        System.out.println(name + " Unmounted CropDuster");
        if (this.getClass() == Pilot.class){
            return "Dismounting cropDuster";
        }
        return "Not allowed to mount Crop Duster";
    }

}
