package com.stimednp.dagger2example.car;

public class Wheels {

    private Rims rims;
    private Tires tires;

    public Wheels(Rims rims, Tires tires) {
        this.tires = tires;
        this.rims = rims;
    }
}
