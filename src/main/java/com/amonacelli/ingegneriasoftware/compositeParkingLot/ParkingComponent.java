package com.amonacelli.ingegneriasoftware.compositeParkingLot;

import java.util.ArrayList;
import java.util.Iterator;

public abstract class ParkingComponent {

    public boolean isAvailable(){
        throw new UnsupportedOperationException();
    }

    public ArrayList<ParkingComponent> availableSpots(){
        throw new UnsupportedOperationException();
    }

    public String getNome() {
        throw new UnsupportedOperationException();
    }

    public String getDescrizione() {
        throw new UnsupportedOperationException();
    }

    public int getNumber(){
        throw new UnsupportedOperationException();
    }

    public int numberOfAvailableSpots(){
        throw new UnsupportedOperationException();
    }

    public int getParkingSize(){
        throw new UnsupportedOperationException();
    }

    public void add(ParkingComponent parkingComponent) {
        throw new UnsupportedOperationException();
    }

    public void remove(ParkingComponent parkingComponent) {
        throw new UnsupportedOperationException();
    }

    public ParkingComponent getChild(int i) {
        throw new UnsupportedOperationException();
    }

    public Iterator createIterator(){
        throw new UnsupportedOperationException();
    }

    public abstract void print();
}
