package com.designpattern.singleton;

public class BillPughSingleton {
    public static void main(String args[]){
        BillPugh billPugh = BillPugh.getInstance();
        System.out.println(billPugh);
        BillPugh billPughOne = BillPugh.getInstance();
        System.out.println(billPughOne);
    }
}

class BillPugh{
    private static class SingletonClass{
        private static final BillPugh INSTANCE = new BillPugh();
    }

    private BillPugh(){

    }

    public static BillPugh getInstance(){
        return SingletonClass.INSTANCE;
    }
}
