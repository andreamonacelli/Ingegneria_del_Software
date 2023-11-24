package com.amonacelli.ingegneriasoftware.compositeToyFactory;

public abstract class ToyItem {

    public String getToyType() {
        throw new UnsupportedOperationException();
    }
    public String getToyName() {
        throw new UnsupportedOperationException();
    }
    public double getPrice() {
        throw new UnsupportedOperationException();
    }
    public ToyItem getChild(int i) {
        throw new UnsupportedOperationException();
    }
    public void print(){
        throw new UnsupportedOperationException();
    }
}