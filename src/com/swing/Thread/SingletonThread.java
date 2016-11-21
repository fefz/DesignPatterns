package com.swing.Thread;

import com.swing.Singleton.DoubleCheckSingleton;
import com.swing.Singleton.LazySingelton;

/**
 * Created by swing on 2016/10/20.
 */
public class SingletonThread implements Runnable{

    protected String name;

    public SingletonThread(String str){
        this.name = str;
    }

    @Override
    public void run() {
        int i = 1;
        while (i <= 2000){
//            DoubleCheckSingleton.getINSTANCE();//双重锁检查
            LazySingelton.getINSTANCE();//懒汉式
            System.out.println("线程" + this.name + "-->执行第" + i + "次");
            i++;
        }
    }

}
