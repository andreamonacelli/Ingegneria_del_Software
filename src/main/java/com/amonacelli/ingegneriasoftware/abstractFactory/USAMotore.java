package com.amonacelli.ingegneriasoftware.abstractFactory;

public class USAMotore extends Motore{

    @Override
    public void create() {
        this.nome = "Motore statunitense";
    }
}
