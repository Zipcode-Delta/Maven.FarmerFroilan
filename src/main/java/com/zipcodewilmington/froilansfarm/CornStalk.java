package com.zipcodewilmington.froilansfarm;

public class CornStalk extends Crop{


    public CornStalk(String name) {
        super(name);
    }

    public CornStalk() {
        this.setNumberOfEdibleCrops(100);
    }
    @Override
    public void setName(String name) {

        setName("earCorn");
    }


}
