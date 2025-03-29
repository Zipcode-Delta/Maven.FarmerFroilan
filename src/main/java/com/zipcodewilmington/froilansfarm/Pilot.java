package com.zipcodewilmington.froilansfarm;

public class Pilot extends Person {

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
