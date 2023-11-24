package com.amonacelli.ingegneriasoftware.compositeParkingLot;

import java.util.Iterator;
import java.util.Stack;

public class CompositeIterator implements Iterator {

    Stack<Iterator<ParkingComponent>> stack = new Stack<Iterator<ParkingComponent>>();

    public CompositeIterator(Iterator iterator) {
        this.stack.push(iterator);
    }

    @Override
    public boolean hasNext() {
        if (stack.empty()) {
            return false;
        } else {
            Iterator<ParkingComponent> iterator = stack.peek();
            if (iterator == null || !iterator.hasNext()) {
                stack.pop();
                return hasNext();
            } else {
                return true;
            }
        }
    }

    @Override
    public Object next() {
        if (hasNext()) {
            Iterator<ParkingComponent> iterator = stack.peek();
            ParkingComponent component = iterator.next();
            stack.push(component.createIterator());
            return component;
        } else {
            return null;
        }
    }
}
