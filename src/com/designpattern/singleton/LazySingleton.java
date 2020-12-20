package com.designpattern.singleton;

public class LazySingleton {

    public static void main(String args[]){
        LazySingletonClass lazySingleton = LazySingletonClass.getInstance();
        System.out.println(lazySingleton);
        LazySingletonClass lazySingletonOne = LazySingletonClass.getInstance();
        System.out.println(lazySingletonOne);
    }

}

class LazySingletonClass{
    private static LazySingletonClass singletonClass= null;

    private LazySingletonClass(){

    }

    public static LazySingletonClass getInstance(){
        if (singletonClass == null){
            singletonClass = new LazySingletonClass();
        }
        return singletonClass;
    }
}
