package com.company;

public class HouseCat extends Cat {

    public HouseCat(String species, String name, String color, int weightInGrams, boolean isNeutered) {
        super(species, name, color, weightInGrams, isNeutered);
    }

    @Override
    public void meow() {
        System.out.println("MOW");
    }


}
