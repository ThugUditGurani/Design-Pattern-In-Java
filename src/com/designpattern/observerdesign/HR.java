package com.designpattern.observerdesign;

public class HR implements Observer {
    @Override
    public void update(String message) {
        System.out.println("Notifying HR"+message);
    }
}
