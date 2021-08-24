package com.company;

public abstract class Cat {
    private String species;
    private String name;
    private String color;
    private int weightInGrams;
    private boolean isNeutered;

    public Cat(String species, String name, String color, int weightInGrams, boolean isNeutered) {
        this.species = species;
        this.name = name;
        this.color = color;
        this.weightInGrams = weightInGrams;
        this.isNeutered = isNeutered;
    }

    public void displayWeightInPounds() {
        StringBuilder output = new StringBuilder();
        int pound = 0;
        int ounce = (int) (0.035274 * weightInGrams);
        while (ounce >= 16) {
            pound++;
            ounce -= 16;
        }
        if (pound > 1) {
            if (ounce > 0) {
                output.append(String.format("%slbs %soz.", pound, ounce));
            } else {
                output.append(String.format("%slbs", pound));
            }

        } else if (pound < 1) {
            if (ounce > 0) {
                output.append(String.format("%soz.", ounce));
            } else {
                output.append("No weight available");
            }
        } else {
            if (ounce > 0) {
                output.append(String.format("%slb %soz.", pound, ounce));
            } else {
                output.append(String.format("%slb", pound));
            }
        }
        System.out.println(output);
    }

    public void neuterCat() {
        isNeutered = true;
    }


}
