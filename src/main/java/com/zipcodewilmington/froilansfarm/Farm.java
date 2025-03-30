package com.zipcodewilmington.froilansfarm;
import com.zipcodewilmington.froilansfarm.FarmHouse;

public class Farm {
    private final FarmHouse farmHouse;
    private final Stable stable1;
    Stable stable2 = new Stable();
    Stable stable3 = new Stable();
    ChickenCoop coop1 = new ChickenCoop();
    ChickenCoop coop2 = new ChickenCoop();
    ChickenCoop coop3 = new ChickenCoop();
    ChickenCoop coop4 = new ChickenCoop();

    Farm() {
        this.farmHouse = new FarmHouse();
        this.stable1 = new Stable();
        this.stable2 = new Stable();
        this.stable3 = new Stable();

    }
}
