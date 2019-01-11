package com.jainn;

import java.util.ArrayList;


public class AddOverride extends ArrayList {

    @Override
    public boolean add(Object o){
        return true;
    }

//    @Override
//    public void add (Object o) {
//        System.out.printf("");
//    }

    public static void main(String[] args){
        AddOverride a = new AddOverride();
        System.out.println("sdfga = " + a.add(2));
        System.out.println("a = " + a);
    }
}
