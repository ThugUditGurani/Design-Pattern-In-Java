package com.designpattern.singleton;

public class StaticBlockSingleton {

    public static void main(String args[]){
        StaticBlock staticBlock = StaticBlock.getInstance();
        System.out.println(staticBlock);
        StaticBlock staticBlockOne = StaticBlock.getInstance();
        System.out.println(staticBlockOne);
    }

}


class StaticBlock{

    private static StaticBlock staticBlock = null;

    static {
        staticBlock = new StaticBlock();
    }

    private StaticBlock(){

    }

    public static StaticBlock getInstance(){
        return staticBlock;
    }

}