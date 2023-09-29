package com.amonacelli.ingegneriasoftware.videogioco;

public class TestClass {
    public static void main(String[] args) {
        System.out.println("---- Warrior ----");
        Character warrior = new Warrior();
        warrior.setFightBehavior(new PlasmaRifleBehavior());
        warrior.setMovementType(new InterstellarShipMove());
        warrior.performFight();
        warrior.performMovement();

        System.out.println("---- Alien ----");
        Character alien = new Alien();
        alien.setFightBehavior(new PoisonousBlobBehavior());
        alien.setMovementType(new TeleportationMove());
        alien.performFight();
        alien.performMovement();
    }
}
