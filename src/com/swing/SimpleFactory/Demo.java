package com.swing.SimpleFactory;

/**
 * Created by swing on 2016/7/5.
 */
public class Demo {

    public static void main(String[] args) {
        Factory factory = new Factory();

        //客户端只需要知道自己需要传递什么参数就可以创建出对应的对象
        Product whiteCar = factory.getType("car");
        Product blackTruck = factory.getType("truck");

        whiteCar.drive();
        blackTruck.drive();
        blackTruck.traffic();
    }
}

