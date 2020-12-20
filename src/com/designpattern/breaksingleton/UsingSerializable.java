package com.designpattern.breaksingleton;

import java.io.*;

public class UsingSerializable {

    public static void main(String args[]){
        SingletonClass singletonClass = SingletonClass.getInstance();
        System.out.println(singletonClass);


        try {
            ObjectOutput output = new ObjectOutputStream(new FileOutputStream("object.ser"));
            output.writeObject(singletonClass);
            output.close();

            ObjectInput input = new ObjectInputStream(new FileInputStream("object.ser"));
            SingletonClass singletonClassOne = (SingletonClass)input.readObject();
            System.out.println(singletonClassOne);
            input.close();
        }catch (Exception e){

        }

    }

}

class SingletonClass implements Serializable{

    private static SingletonClass singleClass = null;
    private SingletonClass(){

    }

    private Object readResolve(){
        return getInstance();
    }

    public static SingletonClass getInstance(){
        if (singleClass == null){
            singleClass = new SingletonClass();
        }
        return singleClass;
    }
}
