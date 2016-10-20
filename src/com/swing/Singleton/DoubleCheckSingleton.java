package com.swing.Singleton;

/**
 * Created by swing on 2016/10/20.
 */
public class DoubleCheckSingleton {

    /**
     * 为了解决多线程环境下的问题，需要使用syncronized关键字
     */

    private static volatile DoubleCheckSingleton INSTANCE = null;

    private DoubleCheckSingleton(){

    }

    /**
     * 双重检查锁定
     * 如果同时有线程A，线程B调用，synchronized加锁来处理创建对象的过程，线程A调用完之后线程B进入方法
     * 但是这时线程B并不知道线程A是否创建了对象，可能会又重复创建一次对象，所以要在内部再进行一次判断
     * @return
     */
    public static DoubleCheckSingleton getINSTANCE(int i){
        if (INSTANCE == null){
            synchronized (DoubleCheckSingleton.class){
                if(INSTANCE == null){
                    INSTANCE = new DoubleCheckSingleton();
                    System.out.println("创建对象...");
                }
            }
        }

        System.out.println("实例" + i);
        return INSTANCE;
    }

}
