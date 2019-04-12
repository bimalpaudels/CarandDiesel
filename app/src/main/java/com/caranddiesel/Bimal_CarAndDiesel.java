package com.caranddiesel;

public class Bimal_CarAndDiesel {

    private String make, year, color, carPrice, engineSize;


    public Bimal_CarAndDiesel(String make, String year, String color, String carPrice, String enginePrice)
    {
        this.make = make;
        this.year = year;
        this.color = color;
        this.carPrice = carPrice;
        this.engineSize = enginePrice;
    }

    public String printOutput()
    {
        return ("Manufacturer: "+ make + ", Current value: "+ carPrice + ", Effective engine size: " + engineSize);
    }
}
