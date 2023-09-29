package com.amonacelli.ingegneriasoftware.person;

import java.util.ArrayList;

public class Italian extends Person{

    public Italian(String name, int age, ArrayList<String> friends) {
        super(name, age, friends);
    }

    @Override
    public void say() {
        parla();
    }

    public void parla(){
        System.out.println("Ciao gente!");
    }
}
