package com.zipcodewilmington.froilansfarm;

public class CornStalk extends Crop{


    public CornStalk(String name) {
        super(name);
    }


    @Override
    public void setNumberOfEdibleCrops(int number) {
        super.setNumberOfEdibleCrops(number);
    }

    @Override
    public void setName(String name) {

        setName("earCorn");
    }


}
