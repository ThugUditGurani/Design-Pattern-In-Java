package com.designpattern.observerdesign;

import java.util.ArrayList;
import java.util.List;

public class Employee implements Subject{
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Employee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    private String name;
    private int age;
    private int salary;

    private List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeobserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        observers.forEach(observer -> {
            System.out.println("Notifying Changed");
            observer.update("Salary Incremented"+this.salary);
        });
    }

    public void incrementedSalary(int salary){
        this.salary += salary;
        notifyObserver();
    }
}
