package com.swing.Thread;


import com.swing.Singleton.DoubleCheckSingleton;

/**
 * Created by swing on 2016/10/20.
 */
public class SingletonThread implements Runnable{

    public DoubleCheckSingleton singleton = null;

    public SingletonThread(){

    }

    @Override
    public void run() {
        int i = 20;
        while (i > 0){
            singleton = DoubleCheckSingleton.getINSTANCE(i);//调用方法创建实例
            i--;
        }
    }


}
