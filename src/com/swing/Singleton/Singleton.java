package com.swing.Singleton;

/**
 * Created by swing on 2016/10/13.
 */
public class Singleton {

    /**
     * 饿汉模式
     */

    //类加载的时候就创建好一个私有变量用来储存唯一实例
    private static final Singleton INSTANCE = new Singleton();

    //将构造函数私有化，防止外部创建实例
    private Singleton(){}

    //公共方法获取唯一实例
    public static Singleton getInstance(){
        return INSTANCE;
    }

}
