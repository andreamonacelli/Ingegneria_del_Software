package com.amonacelli.ingegneriasoftware.compositeParkingLot;

public class ParkingLotTestDrive {
    public static void main(String[] args) {

        /* Test drive funzionante, design pattern implementato correttamente */

        ParkingComponent firstArea = new ParkingArea("Area 1", "Prima area di parcheggio");
        ParkingComponent secondArea = new ParkingArea("Area 2", "Seconda area di parcheggio");
        ParkingComponent thirdArea = new ParkingArea("Area 3", "Terza area di parcheggio");

        ParkingComponent nodoRadice = new ParkingArea("Area Radice", "Area Radice");

        nodoRadice.add(firstArea);
        nodoRadice.add(secondArea);
        nodoRadice.add(thirdArea);

        ParkingComponent subArea11 = new ParkingArea("SubArea 1.1", "Sottoarea");
        ParkingComponent subArea12 = new ParkingArea("SubArea 1.2", "Sottoarea");
        ParkingComponent subArea21 = new ParkingArea("SubArea 2.1", "Sottoarea");
        ParkingComponent subArea22 = new ParkingArea("SubArea 2.2", "Sottoarea");
        ParkingComponent subArea31 = new ParkingArea("SubArea 3.1", "Sottoarea");
        ParkingComponent subArea32 = new ParkingArea("SubArea 3.2", "Sottoarea");

        firstArea.add(subArea11);
        firstArea.add(subArea12);
        secondArea.add(subArea21);
        secondArea.add(subArea22);
        thirdArea.add(subArea31);
        thirdArea.add(subArea32);

        subArea11.add(new ParkingSpot(1, true, 25));
        subArea11.add(new ParkingSpot(2, false, 25));
        subArea12.add(new ParkingSpot(1, true, 25));
        subArea12.add(new ParkingSpot(2, false, 25));
        subArea12.add(new ParkingSpot(3, true, 25));
        subArea21.add(new ParkingSpot(1, true, 25));
        subArea31.add(new ParkingSpot(1, true, 25));

        nodoRadice.print();
    }
}
