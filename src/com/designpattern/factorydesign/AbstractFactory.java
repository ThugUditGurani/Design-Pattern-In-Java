package com.designpattern.factorydesign;

import java.util.Scanner;

public class AbstractFactory {
    public static void main(String args[]){

        System.out.println("Abstract Factory Design Pattern");
        System.out.println("Enter Animal");
        IAbstractFactory<IAnimalInterface> animalInterfaceIAbstractFactory = FactoryProvider.getFactory("animal");
        animalInterfaceIAbstractFactory.getType(new Scanner(System.in).nextLine()).speak();


        IAbstractFactory<IHuman> humanIAbstractFactory = FactoryProvider.getFactory("human");
        humanIAbstractFactory.getType(new Scanner(System.in).nextLine()).speak();

    }
}

interface IAnimalInterface{
    void speak();
}

class CatVoice implements IAnimalInterface{

    @Override
    public void speak() {
        System.out.println("Meow Meow");
    }
}

class DogVoice implements IAnimalInterface{

    @Override
    public void speak() {
        System.out.println("Woa Woa");
    }
}

interface IHuman{
    void speak();
}

class Male implements IHuman{

    @Override
    public void speak() {
        System.out.println(" Male Voice");
    }
}

class Women implements IHuman{

    @Override
    public void speak() {
        System.out.println("Women Voice");
    }
}

interface IAbstractFactory<T>{
    T getType(String type);
}

class HumanFactory implements IAbstractFactory{

    @Override
    public Object getType(String type) {
        if (type.equals("man")){
            return new Male();
        }else if(type.equals("women")){
            return new Women();
        }
        throw new HumanException("Human voice not found");
    }
}

class HumanException extends RuntimeException{
    HumanException(String message){
        super(message);
    }
}

class AnimalFactoryClass implements IAbstractFactory{

    @Override
    public Object getType(String type) {
        if (type.equals("cat")){
            return new CatVoice();
        }else if(type.equals("dog")){
            return new DogVoice();
        }
        throw new AnimalNotFoundException("Animal not found");
    }
}

class AnimalException extends RuntimeException{
    AnimalException(String message){
        super(message);
    }
}

class FactoryProvider{
    static IAbstractFactory getFactory(String factory){
        if (factory.equals("animal")){
            return new AnimalFactoryClass();
        }else if(factory.equals("human")){
            return new HumanFactory();
        }
        throw new FactoryNotFoundException("Factory not found Exception");
    }
}

class FactoryNotFoundException extends RuntimeException{
    FactoryNotFoundException(String message){
        super(message);
    }
}