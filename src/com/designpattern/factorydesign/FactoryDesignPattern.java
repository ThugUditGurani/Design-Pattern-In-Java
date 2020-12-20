package com.designpattern.factorydesign;

import java.util.Scanner;

public class FactoryDesignPattern {

    public static void main(String[] args){
        IAnimalFactory iAnimalFactory = new AnimalFactory();
        iAnimalFactory.getAnimalType(new Scanner(System.in).nextLine()).speak();
    }
}

class AnimalNotFoundException extends RuntimeException{
    AnimalNotFoundException(String message){
        super(message);
    }
}

interface IAnimal{
    void speak();
}

interface IAnimalFactory{
    IAnimal getAnimalType(String type);
}

class AnimalFactory implements IAnimalFactory{

    @Override
    public IAnimal getAnimalType(String type) {
        if (type.equals("cat")){
            return new Cat();
        }else if (type.equals("dog")){
            return new Dog();
        }
        throw new AnimalNotFoundException("Animal not found");
    }
}

class Cat implements IAnimal{

    @Override
    public void speak() {
        System.out.println("Meow Meow");
    }
}

class Dog implements IAnimal{

    @Override
    public void speak() {
        System.out.println("Woof Woof");
    }
}