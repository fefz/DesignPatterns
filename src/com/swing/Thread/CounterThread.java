package com.swing.Thread;

/**
 * Created by swing on 2016/10/13.
 */
public class CounterThread implements Runnable{

    protected Counter counter = null;

    public CounterThread(Counter counter){
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i=0;i<10;i++){
            counter.add(i);
            System.out.println("count is :" + i);
        }
    }
}
