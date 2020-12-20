package com.designpattern.singleton;

public class EnumSingleton {
    public static void main(String args[]){
        EnumSingletonClass enumSingleton = EnumSingletonClass.INSTANCE;
        System.out.println(enumSingleton.hashCode());
        EnumSingletonClass enumSingletonOne = EnumSingletonClass.INSTANCE;
        System.out.println(enumSingletonOne.hashCode());
    }
}

enum EnumSingletonClass{
    INSTANCE;
}
