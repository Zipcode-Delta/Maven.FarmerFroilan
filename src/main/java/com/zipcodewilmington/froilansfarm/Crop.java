package com.zipcodewilmington.froilansfarm;

public class Crop implements Produce {


    private String name;
    private int numberOfEdibleCrops;
    private boolean harvested;

    public Crop(String name) {
        this.name = name;
        this.numberOfEdibleCrops = 0;
        this.harvested = false;
    }

        public boolean harvest () {
            if (hasBeenHarvested()) {
                return !this.harvested;
            }
            return  this.harvested;
        }

        public String getName () {
            return name;
        }

        public void setName (String name){
            this.name = name;
        }

        public int getNumberOfEdibleCrops () {
            return 0;
            //NumberOfEdibleCrops;
        }


        @Override
        public int yield () {
            return 0;
        }

        @Override
        public boolean hasBeenFertilized () {
            return true;
        }

        @Override
        public boolean hasBeenHarvested () {
            return true;
        }
    }


//
//        return true; //made this true from false
//    }
//
//
//    }