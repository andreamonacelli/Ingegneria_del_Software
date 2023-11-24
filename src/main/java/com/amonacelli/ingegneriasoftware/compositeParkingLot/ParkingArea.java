package com.amonacelli.ingegneriasoftware.compositeParkingLot;

import java.util.ArrayList;
import java.util.Iterator;

public class ParkingArea extends ParkingComponent{
    ArrayList<ParkingComponent> parkingsLists = new ArrayList<ParkingComponent>();
    Iterator<ParkingComponent> iterator = null;
    String nome;
    String descrizione;

    public ParkingArea(String nome, String descrizione) {
        this.nome = nome;
        this.descrizione = descrizione;
    }

    @Override
    public ArrayList<ParkingComponent> availableSpots() {
        ArrayList<ParkingComponent> spots = new ArrayList<ParkingComponent>();
        for(ParkingComponent p : parkingsLists){
            try{
                if(p.isAvailable()){
                    spots.add(p);
                }
            }catch (UnsupportedOperationException e){
                spots.addAll(p.availableSpots());
            }
        }
        return spots;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public String getDescrizione() {
        return descrizione;
    }

    @Override
    public int numberOfAvailableSpots() {
        return super.numberOfAvailableSpots();
    }

    @Override
    public void add(ParkingComponent parkingComponent) {
        parkingsLists.add(parkingComponent);
    }

    @Override
    public void remove(ParkingComponent parkingComponent) {
        parkingsLists.remove(parkingComponent);
    }

    @Override
    public ParkingComponent getChild(int i) {
        /* Ritorna il figlio di indice i */
        return parkingsLists.get(i);
    }

    @Override
    public void print() {
        System.out.print("\n" + getNome());
        System.out.println(", " + getDescrizione());
        System.out.println("---------------------");
        Iterator<ParkingComponent> iterator = parkingsLists.iterator();
        while (iterator.hasNext()) {
            ParkingComponent parkingComponent = iterator.next();
            parkingComponent.print();
        }
    }

    @Override
    public Iterator createIterator() {
        if (iterator == null) {
            iterator = new CompositeIterator(parkingsLists.iterator());
        }
        return iterator;
    }
}
