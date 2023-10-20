package com.amonacelli.ingegneriasoftware.decoratorsPC;

public abstract class Computer {
    String description = "This is a generic computer";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
