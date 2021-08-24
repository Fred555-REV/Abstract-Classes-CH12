package com.company;

public class Main {

    public static void main(String[] args) {
        HouseCat garfield = new HouseCat("Persian Tabby", "Garfield", "Orange", 2_500, false);
        garfield.displayWeightInPounds();
        garfield.meow();

    }
}
