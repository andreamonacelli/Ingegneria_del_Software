package com.amonacelli.ingegneriasoftware.person;

import java.util.ArrayList;
import java.util.List;

public class TestClass {
    public static void main(String[] args) {
        Person frank = new English("Frank", 29, new ArrayList<>(List.of("Francesco")));
        Person francesco = new Italian("Francesco", 29, null);
        frank.say();
        francesco.say();
    }
}
