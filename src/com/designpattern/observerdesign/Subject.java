package com.designpattern.observerdesign;

public interface Subject {

    public void addObserver(Observer observer);
    public void removeobserver(Observer observer);
    public void notifyObserver();
}
