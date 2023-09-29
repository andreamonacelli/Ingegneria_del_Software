package com.amonacelli.ingegneriasoftware.person;

import java.util.ArrayList;

public class English extends Person{

    public English(String name, int age, ArrayList<String> friends) {
        super(name, age, friends);
    }

    @Override
    public void say() {
        speak();
    }

    public void speak(){
        System.out.println("Hello World!");
    }
}
