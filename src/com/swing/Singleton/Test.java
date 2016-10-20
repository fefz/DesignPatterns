package com.swing.Singleton;

/**
 * Created by swing on 2016/10/13.
 */
public class Test {

    public static void main(String[] args) {
        LazySingelton obj1 , obj2 , obj3 , obj4;
        obj1 = LazySingelton.getINSTANCE();
        obj2 = LazySingelton.getINSTANCE();
        obj3 = LazySingelton.getINSTANCE();
        obj4 = LazySingelton.getINSTANCE();

        if (obj1 == obj2  && obj3 == obj4){
            System.out.println("只有一个实例");
        }
    }
}
