package com.amonacelli.ingegneriasoftware.decoratorsPC;

public class Notebook extends Computer{
    public Notebook(){
        description = "This is a notebook";
    }

    public double cost() {
        return 450.0;
    }
}
