package com.amonacelli.ingegneriasoftware.videogioco;

public class Character {
    FightBehavior fightBehavior;
    MovementType movementType;

    public Character() {
    }

    public void setMovementType(MovementType movementType) {
        this.movementType = movementType;
    }

    public void setFightBehavior(FightBehavior fb){
        fightBehavior = fb;
    }

    public void performMovement(){
        /* Only method to be called, the method will change alongside the given settings */
        movementType.move();
    }

    public void performFight(){
        /* Only method to be called, the method will change alongside the given settings */
        fightBehavior.fight();
    }
}