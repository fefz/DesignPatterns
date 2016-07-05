package com.swing.SimpleFactory;

/**
 * Created by swing on 2016/7/5.
 */

public class Car implements Product {

    @Override
    public void drive() {
        System.out.println("car can drive");
    }

    @Override
    public void traffic() {
        System.out.println("car can not traffic");
    }
}
