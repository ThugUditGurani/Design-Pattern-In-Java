package com.designpattern.breaksingleton;

public class UsingClonable {
    public static void main(String args[]) throws CloneNotSupportedException {
        SingletonCloneClass singletonClass = SingletonCloneClass.getInstance();
        System.out.println(singletonClass);
        SingletonCloneClass singleClassOne = (SingletonCloneClass) singletonClass.clone();
        System.out.println(singleClassOne);
    }

}

class SingletonCloneClass implements Cloneable{
    private static SingletonCloneClass singletonClass = null;
    private SingletonCloneClass(){

    }
    static {
        singletonClass = new SingletonCloneClass();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
       // return super.clone();
       // return getInstance();
        throw  new CloneNotSupportedException();
    }

    public static SingletonCloneClass getInstance(){
        return singletonClass;
    }
}