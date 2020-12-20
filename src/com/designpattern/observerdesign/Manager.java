package com.designpattern.observerdesign;

public class Manager implements Observer{
    @Override
    public void update(String message) {
        System.out.println("Notifying Manager"+message);
    }
}
