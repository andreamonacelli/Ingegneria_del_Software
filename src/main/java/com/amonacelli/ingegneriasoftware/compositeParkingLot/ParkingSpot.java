package com.amonacelli.ingegneriasoftware.compositeParkingLot;

import java.util.Iterator;

public class ParkingSpot extends ParkingComponent{
    int number;
    boolean available;
    int size;

    public ParkingSpot(int number, boolean available, int size) {
        this.number = number;
        this.available = available;
        this.size = size;
    }

    @Override
    public int getNumber() {
        return number;
    }

    @Override
    public int getParkingSize() {
        return size;
    }

    @Override
    public void print() {
        System.out.println("Dettagli parcheggio #" + getNumber() + ": Dimensione -> " + getParkingSize() + " Libero? " +
                "-> " + isAvailable());
    }

    @Override
    public boolean isAvailable() {
        return available;
    }

    @Override
    public Iterator createIterator(){
        return null;
    }
}
