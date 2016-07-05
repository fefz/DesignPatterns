package com.swing.SimpleFactory;

/**
 * Created by swing on 2016/7/5.
 * 实现接口的实体类
 */
public class Truck implements Product {

    @Override
    public void traffic() {
        System.out.print("truck can traffic");
    }

    @Override
    public void drive() {
        System.out.println("truck can drive");
    }
}
