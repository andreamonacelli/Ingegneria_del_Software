package com.amonacelli.ingegneriasoftware.decoratorsPC;

public class Desktop extends Computer{

    public Desktop(){
        description = "This is a desktop";
    }

    public double cost() {
        return 650.0;
    }
}
