package com.designpattern.singleton;

public class EagerSingleton {

    public static void main(String[] args0){
        EagerSingletonClass eagerSingletonClass = EagerSingletonClass.getInstance();
        System.out.println(eagerSingletonClass);
        EagerSingletonClass eagerSingletonClassOne = EagerSingletonClass.getInstance();
        System.out.println(eagerSingletonClassOne);
    }
}

class EagerSingletonClass{
    private static EagerSingletonClass singletonClass = new EagerSingletonClass();

    private EagerSingletonClass(){
    }

    public static EagerSingletonClass getInstance(){
        return singletonClass;
    }

}
