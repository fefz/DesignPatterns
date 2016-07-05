package com.swing.SimpleFactory;

/**
 * Created by swing on 2016/7/5.
 */
public class Demo {

    public static void main(String[] args) {
        Factory factory = new Factory();

        Product whiteCar = factory.getType("car");
        Product blackTruck = factory.getType("truck");

        whiteCar.drive();
        blackTruck.drive();
        blackTruck.traffic();
    }
}

