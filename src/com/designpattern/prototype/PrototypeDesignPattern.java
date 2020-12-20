package com.designpattern.prototype;

import java.awt.desktop.SystemEventListener;
import java.util.Random;

public class PrototypeDesignPattern {
    public static void main(String args[]) throws CloneNotSupportedException {
        BasicCar bmw = new BMW("Black BMW");
        bmw.price = 200000;
        BasicCar audiCar = new Audi("Blue Audi");
        audiCar.price = 3000000;

        BasicCar basicCarbwm = (BasicCar)bmw.clone();
        basicCarbwm.price = BasicCar.setPrice() + basicCarbwm.price;
        System.out.println("Car Model is"+basicCarbwm.getModelName() + "and price is"+basicCarbwm.price);

        BasicCar basicCaraudi = (BasicCar)audiCar.clone();
        basicCaraudi.price = BasicCar.setPrice() + basicCaraudi.price;
        System.out.println("Car Model is"+basicCaraudi.getModelName() + "and price is"+basicCaraudi.price);
    }
}

class BMW extends BasicCar{
    public BMW(String modelName){
        super.modelName = modelName;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return (BMW)super.clone();
    }
}

class Audi extends BasicCar{
    public Audi(String modelName){
        super.modelName = modelName;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return (Audi)super.clone();
    }
}


class BasicCar implements Cloneable{
    public String modelName;
    public int price = 0;

    public String getModelName(){
        return modelName;
    }

    public void setModelName(String modelName){
        this.modelName = modelName;
    }

    public static int setPrice(){
        return new Random().nextInt(100000);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return (BasicCar)super.clone();
    }
}
