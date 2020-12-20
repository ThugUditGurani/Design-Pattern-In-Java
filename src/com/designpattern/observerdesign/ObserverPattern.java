package com.designpattern.observerdesign;

public class ObserverPattern {
    public static void main(String args[]){
        System.out.println("Observer Design pattern");
        Manager manager = new Manager();
        HR hr = new HR();
        Employee e1 = new Employee("John",28,90000);
        e1.addObserver(manager);
        e1.addObserver(hr);
        e1.incrementedSalary(100000);
    }
}
