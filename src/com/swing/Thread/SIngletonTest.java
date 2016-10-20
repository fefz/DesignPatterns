package com.swing.Thread;


/**
 * Created by swing on 2016/10/20.
 */
public class SIngletonTest {
    public static void main(String[] args) {
        SingletonThread singletonThread1 = new SingletonThread("A");
        SingletonThread singletonThread2 = new SingletonThread("B");
        SingletonThread singletonThread3 = new SingletonThread("C");
        SingletonThread singletonThread4 = new SingletonThread("D");
        new Thread(singletonThread1).start();
        new Thread(singletonThread2).start();
        new Thread(singletonThread3).start();
        new Thread(singletonThread4).start();

        /**
         * 开启4个线程，结果可以发现，每个线程都创建了20个DoubleCheckSingleton的实例，但是只创建了一个实例，
         * 符合单例模式
         */

    }
}
