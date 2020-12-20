package com.designpattern.breaksingleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class UsingReflection {
    public static void main(String args[]) throws IllegalAccessException, InvocationTargetException, InstantiationException {
        SingletonReflectionClass singletonReflectionClass = SingletonReflectionClass.getInstance();
        System.out.println(singletonReflectionClass);

        SingletonReflectionClass singletonReflectionClass1 = null;
        Constructor<?> [] constructors = SingletonReflectionClass.class.getDeclaredConstructors();
        for (Constructor<?> contrustor : constructors){
            contrustor.setAccessible(true);
            singletonReflectionClass1 = (SingletonReflectionClass) contrustor.newInstance();
            break;
        }
        System.out.println(singletonReflectionClass1);
    }
}


class SingletonReflectionClass{
    private static class SingletonClass{
        private static final SingletonReflectionClass singletonClass = new SingletonReflectionClass();
    }
    private SingletonReflectionClass(){
        if (SingletonClass.singletonClass != null){
//            try {
//                throw new IllegalAccessException("Exception");
//            } catch (IllegalAccessException e) {
//                e.printStackTrace();
//            }
            System.exit(0);
        }
    }
    public static SingletonReflectionClass getInstance(){
        return SingletonClass.singletonClass;
    }
}