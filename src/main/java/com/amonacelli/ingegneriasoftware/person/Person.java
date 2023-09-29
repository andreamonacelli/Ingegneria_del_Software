package com.amonacelli.ingegneriasoftware.person;

import java.util.ArrayList;

public class Person {
    String name;
    int age;
    ArrayList<String> friends;

    public Person(String name, int age, ArrayList<String> friends) {
        this.name = name;
        this.age = age;
        this.friends = friends;
    }

    public void say(){
        System.out.println("Generic method");
    }

}
