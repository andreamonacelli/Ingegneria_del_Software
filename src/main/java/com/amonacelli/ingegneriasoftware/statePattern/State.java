package com.amonacelli.ingegneriasoftware.statePattern;

public interface State {
    void insertToken();
    void ejectToken();
    void dispense();
    void turnCrank();
}