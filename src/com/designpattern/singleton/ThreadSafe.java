package com.designpattern.singleton;

public class ThreadSafe {

    public static void main(String args[]){
        ThreadSafeSingleton threadSafeSingleton = ThreadSafeSingleton.getInstance();
        System.out.println(threadSafeSingleton);
        ThreadSafeSingleton threadSafeSingletonOne = ThreadSafeSingleton.getInstance();
        System.out.println(threadSafeSingletonOne);
    }

}

class ThreadSafeSingleton{

    private static ThreadSafeSingleton threadSafeSingleton = null;

    private ThreadSafeSingleton(){

    }

    //Using Sysnchronized Block
    public static synchronized ThreadSafeSingleton getInstance(){
        if (threadSafeSingleton == null){
            synchronized (ThreadSafeSingleton.class){
                if (threadSafeSingleton == null){
                    threadSafeSingleton = new ThreadSafeSingleton();
                }
            }
        }
        return threadSafeSingleton;
    }


    //Using Synchronized Method
//    public static synchronized ThreadSafeSingleton getInstance(){
//        if (threadSafeSingleton == null){
//            threadSafeSingleton = new ThreadSafeSingleton();
//        }
//        return threadSafeSingleton;
//    }

}
